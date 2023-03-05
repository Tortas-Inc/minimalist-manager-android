package com.tortas.minimalistmanager.feature_onboarding.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.tortas.minimalistmanager.core.ext.performHapticFeedback
import com.tortas.minimalistmanager.core.ext.setUpLightStatusBar
import com.tortas.minimalistmanager.databinding.ActivityOnboardingBinding
import com.tortas.minimalistmanager.feature_onboarding.domain.model.OnboardingData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding
    private val viewModel: OnboardingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpLightStatusBar()
        setUpStateFlow()
        setUpOnClickListeners()
    }

    private fun setUpStateFlow() = lifecycleScope.launchWhenCreated {
        viewModel.stateFlow.collectLatest { state ->
            setUpOnboarding(state)
        }
    }

    private fun setUpOnboarding(onboardingData: OnboardingData) = with(binding) {
        val adapter = OnboardingPageAdapter(onboardingData.pages)
        viewPages.adapter = adapter
        viewPages.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        circleIndicator.setViewPager(viewPages)

        viewPages.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                root.performHapticFeedback()
            }
        })
    }

    private fun setUpOnClickListeners() = with(binding) {
        buttonClose.setOnClickListener {
            finish()
        }
    }
}

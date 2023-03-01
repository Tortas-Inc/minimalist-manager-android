package com.tortas.minimalistmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tortas.minimalistmanager.core.ext.setUpLightStatusBar
import com.tortas.minimalistmanager.feature_onboarding.presentation.OnboardingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpLightStatusBar()
        openOnboarding()
    }

    private fun openOnboarding() {
        val intent = Intent(this, OnboardingActivity::class.java)
        startActivity(intent)
    }
}

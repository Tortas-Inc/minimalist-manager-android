package com.tortas.minimalistmanager.feature_onboarding.presentation

import androidx.lifecycle.ViewModel
import com.tortas.minimalistmanager.feature_onboarding.domain.model.OnboardingData
import com.tortas.minimalistmanager.feature_onboarding.domain.use_case.GetOnboardingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val getOnboardingUseCase: GetOnboardingUseCase
): ViewModel() {

    private val _stateFlow = MutableStateFlow(OnboardingData())
    val stateFlow = _stateFlow.asStateFlow()

    init {
        _stateFlow.value = getOnboardingUseCase()
    }
}

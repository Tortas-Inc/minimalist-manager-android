package com.tortas.minimalistmanager.feature_onboarding.domain.use_case

import com.tortas.minimalistmanager.R
import com.tortas.minimalistmanager.feature_onboarding.domain.model.OnboardingData
import com.tortas.minimalistmanager.feature_onboarding.domain.model.OnboardingPage

class GetOnboardingUseCase {

    operator fun invoke(): OnboardingData {
        return OnboardingData(
            pages = buildPages()
        )
    }

    private fun buildPages(): List<OnboardingPage> {
        return listOf(
            OnboardingPage(
                R.drawable.hand,
                R.string.onboarding_title_page_1,
                R.string.onboarding_body_page_1
            ),
            OnboardingPage(
                R.drawable.hand,
                R.string.onboarding_title_page_2,
                R.string.onboarding_body_page_2
            ),
            OnboardingPage(
                R.drawable.hand,
                R.string.onboarding_title_page_3,
                R.string.onboarding_body_page_3
            ),
        )
    }

}
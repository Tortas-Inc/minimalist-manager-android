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
                "Enjoy 20\nmillions songs\nIt's Ad free",
                "This is a body text to test this component and see how it sees."
            ),
            OnboardingPage(
                R.drawable.hand,
                "Enjoy 20\nmillions songs\nIt's Ad free",
                "This is a body text to test this component and see how it sees."
            ),
            OnboardingPage(
                R.drawable.hand,
                "Enjoy 20\nmillions songs\nIt's Ad free",
                "This is a body text to test this component and see how it sees."
            ),
        )
    }

}
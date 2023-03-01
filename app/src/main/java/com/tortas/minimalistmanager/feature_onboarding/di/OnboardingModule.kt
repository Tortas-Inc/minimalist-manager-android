package com.tortas.minimalistmanager.feature_onboarding.di

import com.tortas.minimalistmanager.feature_onboarding.domain.use_case.GetOnboardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class OnboardingModule {

    @Provides
    @Singleton
    fun providesGetOnboardingUseCase(): GetOnboardingUseCase {
        return GetOnboardingUseCase()
    }

}
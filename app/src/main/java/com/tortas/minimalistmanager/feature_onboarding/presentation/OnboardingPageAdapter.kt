package com.tortas.minimalistmanager.feature_onboarding.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tortas.minimalistmanager.databinding.ItemOnboardingPageViewBinding
import com.tortas.minimalistmanager.feature_onboarding.domain.model.OnboardingPage

class OnboardingPageAdapter(
    private val onboardingPages: List<OnboardingPage>
): RecyclerView.Adapter<OnboardingPageAdapter.PageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageHolder {
        return PageHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PageHolder, position: Int) {
        holder.bindHolder(
            onboardingPages[position]
        )
    }

    override fun getItemCount(): Int {
        return onboardingPages.size
    }

    class PageHolder(
        private val binding: ItemOnboardingPageViewBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindHolder(page: OnboardingPage) = with(binding) {
            title.text = page.title
            textViewBody.text = page.body
            imageView.setImageResource(page.image)
        }

        companion object {
            fun from(parent: ViewGroup): PageHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemOnboardingPageViewBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
                return PageHolder(binding)
            }
        }
    }

}

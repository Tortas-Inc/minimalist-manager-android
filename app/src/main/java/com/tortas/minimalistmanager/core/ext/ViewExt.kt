package com.tortas.minimalistmanager.core.ext

import android.view.HapticFeedbackConstants
import android.view.View

fun View.performHapticFeedback() {
    this.performHapticFeedback(
        HapticFeedbackConstants.VIRTUAL_KEY,
        HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING
    )
}
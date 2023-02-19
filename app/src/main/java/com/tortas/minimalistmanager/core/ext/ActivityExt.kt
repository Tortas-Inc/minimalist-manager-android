package com.tortas.minimalistmanager.core.ext

import android.graphics.Color
import android.view.View
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.setUpLightStatusBar() {
    val view = window.decorView
    var flags: Int = view.systemUiVisibility
    flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    view.systemUiVisibility = flags
    window.statusBarColor = Color.parseColor("#F6F6F6")
}
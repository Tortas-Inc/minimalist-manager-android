package com.tortas.minimalistmanager.core.utils

import android.content.Context

sealed class UiText {
    data class DynamicString(val text: String, val messageType: MessageType): UiText()
    data class StringResource(val resId: Int, val messageType: MessageType): UiText()

    fun asString(context: Context): String {
        return when(this) {
            is DynamicString -> text
            is StringResource -> context.getString(resId)
        }
    }
}



enum class MessageType {
    IO,
    HTTP,
    DEFAULT_ERROR,
    NORMAL,
    SUCCESS
}

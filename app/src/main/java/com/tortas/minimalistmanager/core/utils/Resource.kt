package com.tortas.minimalistmanager.core.utils

sealed class Resource<T>(val data: T? = null, val message: UiText? = null) {
    class Loading<T>(data: T? = null): Resource<T>(data)
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(message: UiText, data: T? = null): Resource<T>(data, message)
}

inline fun <T : Any> Resource<T>.onSuccess(action: (T?) -> Unit): Resource<T> {
    if (this is Resource.Success) action(data)
    return this
}

inline fun <T : Any> Resource<T>.onError(action: (message: UiText?) -> Unit): Resource<T> {
    if (this is Resource.Error) action(message)
    return this
}

inline fun <T : Any> Resource<T>.onLoading(action: (T?) -> Unit): Resource<T> {
    if (this is Resource.Loading) action(data)
    return this
}
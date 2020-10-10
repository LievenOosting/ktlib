package com.lieven.ktlib.interf

interface OnNetListener {
    fun <T> onSuccess(msg: T)
    fun onFailure(e: Exception)
}
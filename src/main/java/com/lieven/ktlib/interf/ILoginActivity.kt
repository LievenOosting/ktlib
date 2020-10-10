package com.lieven.ktlib.interf

interface ILoginActivity {
    fun <T> showLogin(loginBean: T, code: String, msg: String)
}
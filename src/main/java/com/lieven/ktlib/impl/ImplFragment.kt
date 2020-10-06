package com.lieven.ktlib.impl

interface ImplFragment {
    fun getLayoutId(): Int
    fun attach()
    fun createView()
    fun viewCreated()
}
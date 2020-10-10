package com.lieven.ktlib.interf

interface IFragment {
    fun getLayoutId(): Int
    fun attach()
    fun createView()
    fun viewCreated()
}
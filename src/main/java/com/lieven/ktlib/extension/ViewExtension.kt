package com.lieven.ktlib.extension

import android.util.Log
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.reflect.KClass

fun <T : ViewModel> AppCompatActivity.getViewModel(modelClass: KClass<T>): T {
    return ViewModelProvider(this).get(modelClass.java)
}

fun AppCompatActivity.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.replaceFragment(viewGroupId: Int, fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(viewGroupId, fragment)
        .commit()
}

fun AppCompatActivity.v(tag: String, msg: String) {
    Log.v(tag, msg)
}

fun AppCompatActivity.addFragmentToState(
    @IdRes containerViewId: Int,
    fragment: Fragment,
    tag: String
) {
    supportFragmentManager.beginTransaction()
        .add(containerViewId, fragment, tag)
        .commit()
}

fun AppCompatActivity.showFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .show(fragment)
        .commit()
}

fun AppCompatActivity.hideFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .hide(fragment)
        .commit()
}

fun <T : ViewModel> Fragment.getViewModel(modelClass: KClass<T>): T {
    return ViewModelProvider(this).get(modelClass.java)
}

fun Fragment.v(tag: String, msg: String) {
    Log.v(tag, msg)
}

package com.lieven.ktlib.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lieven.ktlib.interf.IActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseActivity : AppCompatActivity(), IActivity,CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job
    private lateinit var job: Job
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        job = Job()
        createView()
        setListener()
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}
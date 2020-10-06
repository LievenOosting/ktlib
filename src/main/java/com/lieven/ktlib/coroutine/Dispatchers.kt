package com.lieven.ktlib.coroutine

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.newFixedThreadPoolContext

val DB = newSingleThreadContext("DB")
val NETWORK = newFixedThreadPoolContext(2,"NETWORK")

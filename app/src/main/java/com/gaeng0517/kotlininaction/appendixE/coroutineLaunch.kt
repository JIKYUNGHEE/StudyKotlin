package com.gaeng0517.kotlininaction.appendixE

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit


@RequiresApi(Build.VERSION_CODES.O)
fun now() = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.MILLIS)

@RequiresApi(Build.VERSION_CODES.O)
fun log(msg: String) = println("${now()} : ${Thread.currentThread()} : $msg")

@RequiresApi(Build.VERSION_CODES.O)
fun launchInGlobalScope() {
    GlobalScope.launch {
        log("coroutine started")
    }
}

fun main() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        log("main() started")
        launchInGlobalScope()
        log("launchInGlobalScope() executed")
    }
}
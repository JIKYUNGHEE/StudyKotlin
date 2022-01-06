package com.gaeng0517.kotlininaction.appendixE

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Assert.*
import org.junit.Test
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit

class CoroutineLaunchKtTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun coroutineTest() {
        log("main() started")
        launchInGlobalScope()
        log("launchInGlobalScope() executed")
    }
}

fun now() = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.MILLIS)

fun log(msg: String) = println("${now()} : ${Thread.currentThread()} : $msg")

fun launchInGlobalScope() {
    GlobalScope.launch {
        log("coroutine started")
    }
}

fun main() {
    log("main() started")
    launchInGlobalScope()
    log("launchInGlobalScope() executed")
}
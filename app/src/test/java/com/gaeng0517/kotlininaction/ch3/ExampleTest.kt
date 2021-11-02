package com.gaeng0517.kotlinpractice

import org.junit.Test

import org.junit.Assert.*
import com.gaeng0517.kotlininaction.ch3.`5`.parsePath

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun ch3_5_1_split() {
        assertEquals(arrayListOf(12, 345, 6, "A"), "12.345-6.A".split("\\.|-".toRegex()))
    }

    @Test
    fun ch_5_2_regex() {
        parsePath("/Users/yole/kotlin-book/chapter.adoc")
    }
}
package com.gaeng0517.kotlinpractice

import org.junit.Test

import org.junit.Assert.*
import com.gaeng0517.kotlininaction.ch3.`5`.parsePath
import com.gaeng0517.kotlininaction.ch5.`1`.Person
import com.gaeng0517.kotlininaction.ch5.`1`.findTheOldest

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
    fun ch3_5_2_split() {
        assertEquals(arrayListOf(12, 345, 6, "A"), "12.345-6.A".split("\\.|-".toRegex()))
    }

    @Test
    fun ch3_5_2_split_print_use_regex() {
        print( "12.345-6.A".split("\\.|-".toRegex()))
    }

    @Test
    fun ch3_5_2_split_print_not_ues_regex() {
        print( "12.345-6.A".split(".", "-"))
    }

    @Test
    fun ch_3_5_3_parse_path() {
        parsePath("/Users/yole/kotlin-book/chapter.adoc")
    }

    @Test
    fun ch_5_3_3_multi_regex() {
        // .를 구분 문자열로 사용
        val kotlinLogo = """| //
                           .| //
                            .| / \""".trimMargin(".")    // . 와 직전의 공백 제거(확장함수)


        println(kotlinLogo)
    }

    @Test
    fun ch_3_5_3_can_include_special_symbol() {
        /*
            책에서는 """C:\Users\yole\kotlin-book""" 로 되어있는데.. 오타가 난 걸로 보인다..? 아니라면 답글 부탁드립니다!
         */
        val windowPath = """C:\\Users\\yole\\kotlin-book"""

        println(windowPath)
    }

    @Test
    fun ch_3_5_3_can_include_special_symbol2() {
        val windowPath = """C:\Users\yole\kotlin-book"""

        println(windowPath)
    }

    @Test
    fun ch_3_5_4_can_include_template_literals_inner_string() {
        val price = """${'$'}99.9"""
//        val price = """$99.9"""
//        val dollar = '$'
//        val price = "${dollar}99.9"

        println(price)
    }

    @Test
    fun ch_5_1_1_use_for_loop() {
        val people = listOf(Person("sybang", 20), Person("mjkim", 21), Person("khji", 26))
        findTheOldest(people)
    }

    @Test
    fun ch_5_1_2_use_lambda_maxBy() {
        val people = listOf(Person("sybang", 20), Person("mjkim", 21), Person("khji", 26))
        println(people.maxBy { it.age })
    }

    @Test
    fun ch_5_1_3_use_member_reference() {
        val people = listOf(Person("sybang", 20), Person("mjkim", 21), Person("khji", 26))
        println(people.maxBy (Person::age))
    }

    @Test
    fun ch_5_2_1_use_lambda() {
        val people = listOf(Person("sybang", 20), Person("mjkim", 21), Person("khji", 26))
        println(people.maxBy({ p:Person -> p.age}))
    }
}
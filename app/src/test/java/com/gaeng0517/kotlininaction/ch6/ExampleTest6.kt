package com.gaeng0517.kotlinpractice

import org.junit.Test

import org.junit.Assert.*
import com.gaeng0517.kotlininaction.ch3.`5`.parsePath
import com.gaeng0517.kotlininaction.ch5.`1`.Person
import com.gaeng0517.kotlininaction.ch5.`1`.findTheOldest
import java.lang.IllegalArgumentException

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleTest6 {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun ch6_2_1() {
        var i : Int = 1
        val list: List<Int> = listOf(1, 2, 3)
    }

    @Test
    fun ch6_2_1_1() {
        showProgress(143)
    }

    fun showProgress(progress: Int) {
        val percent = progress.coerceIn(0, 100)
        println("We're ${percent}% done")
    }

    @Test
    fun ch6_2_2_1() {
        print(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    }

    @Test
    fun ch6_2_2_2() {
        print(Person("Sam", 35).isOlderThan(Person("Amy")))
    }

    data class Person(val name: String, val age: Int? = null) {
        fun isOlderThan(other: Person): Boolean ? {
            if(age == null || other.age == null)
                return null
            return age > other.age
        }
    }

    @Test
    fun ch6_2_3_1() {

        val i = 1
        val l: Long = i.toLong()
    }

    @Test
    fun ch6_2_3_2() {
        val int = 1
        int.toLong()
        println(int.toLong())
    }

    @Test
    fun ch6_2_3_3() {
        val long = 1234567890123456789
        println(long.toInt())
        println(long)
    }

    @Test
    fun ch6_2_3_4() {
        val long = 1
        val int:Int = long
        println(int)
        println(long)
    }

    @Test
    fun ch6_2_3_7() {
        val x = 1
        val list = listOf(1L, 2L, 3L)
        x.toLong() in list
    }

    @Test
    fun ch6_2_3_8() {
        val b:Byte = 1  //상수 값은 적절한 타입으로 해석된다.
        val l = b + 1L  //+ 연산자는 Byte 와 Long 을 인자로 받을 수 있다.
        foo(42) // 컴파일러는 42를 Long 값으로 해석한다.
    }

    fun foo(l: Long) = println(l)

    @Test
    fun ch6_2_3_9() {
        val b:Byte = 5
        val c:Byte = 127

        print((b+c).toByte())
    }

    @Test
    fun ch6_2_6_1() {
       val nothing = fail("Error occurred")

    }

    interface Processor<T> {
        fun process(): T
    }

    class NoResultProcessor : Processor<Unit> {
        override fun process() {    // Unit 을 반환하지만 타입을 지정할 필요는 없다.
            //업무 처리 코드
                //여기서 return 을 명시할 필요가 없다.
        }
    }

    fun fail(message: String) : Nothing { // 아무 값도 포함하지 않는다.
        throw IllegalArgumentException(message)
    }

    @Test
    fun ch6_2_6_2() {
        val nullableValue: String? = null
        val value = nullableValue ?: throw IllegalStateException()
        print(value)
    }
}

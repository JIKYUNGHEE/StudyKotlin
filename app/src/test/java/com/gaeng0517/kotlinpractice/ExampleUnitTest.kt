package com.gaeng0517.kotlinpractice

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test1() {
        fun printLength(obj: Any) {
            println("'$obj' string length is ${getString(obj) ?: "...err, not an string"}")
        }

        printLength("Incomprehesibilites")
        printLength(1000)
        printLength(listOf(Any()))
    }

    private fun getString(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return null
    }

    @Test
    fun test2() {
        fun main() {
            var myAge: Int = 28
            val name: String = "Gaeng"
            val lastName = "JI"
            val weight = 48.3

            println(name)
            println("I am $myAge years old")

            myAge += 1
            println("I am $myAge years old, and weight $weight kg")

            val fullName = "$lastName, $name"
            println(fullName)

            val ageAsString = myAge.toString()
            println(ageAsString)

            val ageFromString = "35".toInt()
            println(ageFromString)

            val nameLength = fullName.length
            println(nameLength)

            //This is a line comment

            /**
             * THis is a multiline comment.
             * You don't have to add // before each line.
             */
        }

        main()
    }

    @Test
    fun test3() {
        fun main() {
            val isProgrammingAwesome = true

            println("Is programming awesome? $isProgrammingAwesome")

            val myAge = 29

            val isLegalDrivingAge = myAge >= 18
            println(isLegalDrivingAge)

            val ageTim = 27
            val isTimOlder = ageTim > myAge
            println(isTimOlder)

            val yearOfBirth = 1992
            val isBornInTwentiethCentury = yearOfBirth < 2000
            println(isBornInTwentiethCentury)

            val strangerName = "Tim"
            val myName = "Gaeng"

            val isSameName = strangerName==myName
            println(isSameName)

            val areNamesDifferent = myName != strangerName
            println(areNamesDifferent)

            println(!areNamesDifferent)

            val firstObject = Any()
            val secondObject = Any()

            println(firstObject === secondObject)   //false - 다른 메모리
            println(firstObject !== secondObject)   // true -

            val isNameEmpty = myName.isEmpty()
            println(isNameEmpty)


        }

        main()
    }

    @Test
    fun challenge1() {
        val password1 = "123456"
        val password2 = "1234567890987654321"

        fun isSecurePassword(password : String) : Boolean {
            return password.length >= 10
        }

        println(isSecurePassword(password1))
        println(isSecurePassword(password2))
    }

    @Test
    fun challenge2(){
        val name1 = "TOM"
        val name2 = "TOM"
        println(name1.length == name2.length)
    }
}
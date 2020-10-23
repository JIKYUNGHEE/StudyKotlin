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

            val isSameName = strangerName == myName
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

        fun isSecurePassword(password: String): Boolean {
            return password.length >= 10
        }

        println(isSecurePassword(password1))
        println(isSecurePassword(password2))
    }

    @Test
    fun challenge2() {
        val name1 = "TOM"
        val name2 = "TOM"
        println(name1.length == name2.length)
    }

    @Test
    fun test4() {
        val myAge = 29
        val country = "Korea"

        val isLegalDrivingAge =
            (myAge >= 18 && country == "Korea") || (myAge >= 16 && country == "USA")
        println(isLegalDrivingAge)

        val ageMessage = if (myAge >= 18) "I'm an adult" else "I'm still underAged!"
        println(ageMessage)
        println(if (myAge >= 18) "I'm an adult" else "I'm still underAged!")

        val yearOfBirth = 1992
        val generationCohort = if (yearOfBirth > 1964 && yearOfBirth < 1980) {
            "GenerationX"
        } else if (yearOfBirth >= 1980 && yearOfBirth < 2000) {
            "Milliner"
        } else {
            "Generation Z"
        }
        println(generationCohort)
    }

    @Test
    fun challenge3() {
        val userName = "khjihahahhoho"
        val password = "password10101010101"
        val email = "khji@mobileleder.com"
        val isValidProperties =
            if (userName.isEmpty() || password.isEmpty() || email.isEmpty()) {
                "EMPTY"
            } else if (userName.length < 6) {
                "UserName is too short"
            } else if (password.length < 10) {
                "password is too short"
            } else if (!email.contains("@") || !email.contains(".")) {
                "email don't contain @ or ."
            } else {
                "VALID"
            }

        println(isValidProperties)
    }

    @Test
    fun test6() {
        val myName = "Filip"
        val nickname: String? = null
        val lastName: String? = null

        println(nickname)

        val nickNameLength = nickname?.length?.toDouble()
        println(nickNameLength)

        if (lastName != null) {
            println("My last name is ${lastName.length} characters long")
        } else {
            println("I don't have a last name")
        }

        if (nickname?.isEmpty() == true) {
            print("You don't have a nickname! It's length is ${nickname.length}")
        }

//        val notNullNickname = requireNotNull(nickname)
//        println(notNullNickname.length)

        val myNickname = nickname
        println(myNickname)

        val lastBirthday = 2020
        val myAge: Int? = null

        val myAgeNotNull = myAge ?: return
        println("I was born in $myAgeNotNull")
    }

    @Test
    fun challenge4() {
        val password = "password"

        val myPassword: String? = "12345"
        val message = if (password == null || password.isEmpty()) {
            "Ehm, you need a password to kee safe!"
        } else if (password.length > 0 && password.length < 6) {
            "Weak"
        } else if (password.length > 10) {
            "No one is getting through this"
        } else {
            "Ignored"
        }
    }

    @Test
    fun challenge5() {
        val name = "kyunghee"
        val lastName = "JI"
        val nickName: String? = "Gaeng"
        val country = "KOREA"
        val age = 29
    }

    @Test
    fun test2_1() {
        val fullName = Pair<String, String>("KYUNGHEE", "JI")
//        val age = 29
        println("My name is ${fullName.first}, ${fullName.second}")

//        val (name, lastName) = fullName
//        println("My name is $name, $lastName")
//        val person = Pair(fullName, 29)

        val birthday = Triple(17, 5, 1992)
        val person = Pair(fullName, birthday)

        val nameUsingOrdering = person.first
        val birthdayUsingOrdering = person.second

        val (name, bday) = person
        val (day, month, year) = bday

        val yearOfBirth = bday.third
        println("$name was born on $day / $month, year unknown!")
    }

    @Test
    fun challenge2_1() {
        val creditCard = Triple("1234-5678-90", "555", "VISA")  //(cardNumber, securityCode, type)
        val bankAccount = Pair(16000.0, creditCard)

        val (balance, card) = bankAccount
        val (cardNumber, securityCode, type) = card

        println("My bankAccount is $balance")
        println("creditCard info: number is $cardNumber, securityCode is $securityCode, type is $type")
    }

    @Test
    fun test2_2() {
//        val country1 = "Russia"
//        val country2 = "USA"
//        val country3 = "Poland"

        val visitedCountries = arrayOf(
            "France", "Spain", "England", "Greece"
        )

        println(visitedCountries)
        println(visitedCountries.size)

        println(visitedCountries[3])

//        println(visitedCountries[20])
//        println(visitedCountries[-1])
        visitedCountries + "Italy"
        println(visitedCountries.size)

        visitedCountries[1] = "KOREA"
        println(visitedCountries[1])

        val sizedArray = Array(10) { "" }
        val emptyArray = emptyArray<String>()

        val arrayOfInts = intArrayOf(2, 3, 4, 5, 6, 7)
        println(arrayOfInts)

        val intArray = IntArray(10)
        println(intArray)

        println(visitedCountries.lastIndex)
        println(visitedCountries.last())
        println(visitedCountries.first())

        val currentCountry = "Spain"
        println(visitedCountries.contains(currentCountry))

        val hasVisitedSpain = currentCountry in visitedCountries
        val hasNotVisitedSpain = currentCountry !in visitedCountries

        println(hasVisitedSpain)
        println(hasNotVisitedSpain)
    }
}
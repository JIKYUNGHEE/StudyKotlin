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

    @Test
    fun test2_3() {
        val countries = listOf("Russia", "USA", "The Netherlands")
        println(countries)

//        val mutableList = mutableListOf<>("Russia", "USA", "The Netherlands")
        val mutableList = countries.toMutableList()
        mutableList.add("Germany")
        mutableList.add(1, "Greece")

        println(mutableList)
        mutableList.addAll(3, listOf("Austria", "Poland", "Hungary"))
        println(mutableList)

        val hasBeenToJapan = "Japan" in mutableList
        println(hasBeenToJapan)

        mutableList.remove("Japan")
        mutableList.removeAt(0)
        mutableList.removeAll(listOf("Greece", "Poland", "Hungary"))
        println(mutableList)

        mutableList[2] = "Croatia"
        val combinedList = countries + mutableList
        val emptyList = emptyList<String>()

        println(mutableList)
        println(combinedList)
        println(emptyList)
    }

    @Test
    fun challenge2_2() {
        val games = arrayOf("카트라이더", "버블팡", "오투잼", "모두의 마블", "스플랜더")
        games[2] = "애니팡"
        println(games[1])

        val gamesList = games.toMutableList()
        gamesList.add("기타숑숑")
        gamesList.add("멍멍랜드")

        gamesList.remove("스플랜더")
        print(gamesList)
    }

    @Test
    fun test3_1() {
        val visitedCountries = arrayOf("Russia", "USA", "The Netherlands", "Greece", "Germany")
        var i = 0
        while (i < visitedCountries.size) {
            println("Country at index $i is ${visitedCountries[i]}")
            i++
        }
        println("====================================================")
        i = 0

        do {
            println("Country at index $i is ${visitedCountries[i]}")
            i++
        } while (i < visitedCountries.size)
    }

    @Test
    fun challenge3_1() {
        var i = 0
        while (i < 15) {
            println("now number is ${i + 1}")
            i++
        }
    }

    @Test
    fun challenge3_2() {
        val names = arrayOf("지경희", "이소희", "유진")
        var i = names.size
        do {
            if (i > names.lastIndex || i < 0) return

            println("now name is ${names[i - 1]}")
            i--
        } while (i > 0)
    }

    @Test
    fun test3_2() {
        val names = arrayOf("지경희", "이소희", "유진")

        val rageFromZeroToTen = 0..10
        println(rageFromZeroToTen)

        val exclusiveRage = 0 until 10
        println(exclusiveRage)

        for (index in rageFromZeroToTen) {
            print(index)
        }

        println("")

        for (index in rageFromZeroToTen step 2) {
            print(index)
        }
        println("")

        for (index in 10 downTo 0) {
            print(index)
        }
        println("")

        for (index in 0..names.lastIndex) {
            print(names[index])
        }
        println("")

        for (name in names) {
            print(name)
        }
    }

    @Test
    fun challenge3_3() {
        val number = arrayListOf<Int>()
        for (n in 10..30) {
            number.add(n)
        }
        for (n in number) {
            print("$n ")
        }
    }

    @Test
    fun challenge3_4() {
        val number = arrayListOf<Int>()
        for (n in 10..30) {
            number.add(n)
        }
        for (n in 3..number.lastIndex step 3) {
            print("$n ")
        }
    }

    @Test
    fun challenge3_5() {
        val reverseRange = 30 downTo 15

        for (n in reverseRange step 2) {
            print("$n ")
        }
    }

    @Test
    fun test3_3() {
        val daysOfWeek =
            listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

        for (day in daysOfWeek) {
            if (day == "Monday") {
                continue
            }
            println("Working!")

            if (day == "Thursday") {
                println("Get ready for the weekend!")
                break
            }
        }

        val matrix = MutableList(5) { MutableList(5) { "" } }
        for (row in 0..matrix.lastIndex) {
            for (column in 0..matrix.lastIndex) {
                matrix[row][column] = "$row:$column"
            }
        }
        print(matrix)
        println("--------")

        for (row in matrix) {
            println(row)
        }

        val thirdRowFifthColumnElement = matrix[2][4]
        println(thirdRowFifthColumnElement)

        row@ for (row in 0..5) {
            column@ for (column in 0..5) {
                if (column == 2 && row == 2) {
                    break@row
                }
                print("x\t")
            }
            println()
        }
    }

    @Test
    fun challenge3_6() {
        val matrixRow = 5
        val matrixColumn = 8
        val matrix = MutableList(matrixRow) { MutableList(matrixColumn) { "." } }

        matrix[3][6] = "X"

        loop@ for (row in 0 until matrixRow) {
            println("Searching in row $row")
            for (column in 0 until matrixColumn) {
                if (matrix[row][column] == "X") {
                    println("Found X at $row:$column")
                    break@loop
                }
            }
        }
//        row@ for (row in 0..matrix.lastIndex) {
//            column@ for (column in 0..matrix.lastIndex) {
//                if (column == 2 && row == 2) {
//                    print("x\t")
//                    break@column
//                }
//                print(".\t")
//            }
//            println()
//        }
    }

    @Test
    fun test3_4() {
        val myAge = 25

        when (myAge) {
            25 -> println("Quarter century!")
            23 -> println("Close to a quarter century")
            else -> {
                println("Don't know your age!")
            }
        }

//        when(myAge){
//            in 0..12 -> println("Still a young boy")
//            in 13..19 -> println("Teenager")
//            in 20..29 -> println("In my twenties")
//            in 30..39 -> println("In my thirties")
//            in 40..49 -> println("In my forties")
//            else -> println("I'm a wise man :]")
//        }
        val message = when (myAge) {
            in 0..12 -> "Still a young boy"
            in 13..19 -> "Teenager"
            in 20..29 -> "In my twenties"
            in 30..39 -> "In my thirties"
            in 40..49 -> "In my forties"
            else -> "I'm a wise man :]"
        }
        println(message)

        val email: String? = "khji@mobileleader.com"
        val password: String? = "iLoveKotlin!"

        when {
            email == null || email.isEmpty() -> println("You need to choose email!")
            "@" !in email -> println("Your email is invalid!")
            password == null || password.isEmpty() -> println("You need to choose a password")
            password.length < 10 -> println("Password not strong enough!")
            else -> println("Email Length: ${email.length}, Password Length: ${password.length}")
        }
    }

    @Test
    fun challenge3_7() {
        val thisYear = 2020
        val message = when (thisYear) {
            in 1990..1999 -> "20th"
            in 2000..2010 -> "21th"
            in 2011..2020 -> "21.1th"
            else -> "This was loong age!"
        }
        println(message)
    }

    @Test
    fun test4_1() {
        val videoGamesCollections = mutableMapOf<String, MutableList<String>>()
        println(videoGamesCollections)

        videoGamesCollections.put(
            "Action",
            mutableListOf("Dark Souls", "Sekiro: Shadows Die Twice")
        )
        println(videoGamesCollections)

//        val actionGames = videoGamesCollections.get("Action")
        val actionGames = videoGamesCollections["Action"]
        println(actionGames)

        val actionGames2 = videoGamesCollections["GG"]
        println(actionGames2)

        val authenticationHeaders = mapOf(
            "API_KEY" to "your-api-key",
            "Authorization" to "auth token",
            "content/type" to "application/json"
        )
        println(authenticationHeaders)

        videoGamesCollections["Strategy"] = mutableListOf("Heroes of Might & Magic 3")
        println(videoGamesCollections)

        videoGamesCollections["Strategy"]?.add("Civilisation VI")
        println(videoGamesCollections)

        val removedActionGames = videoGamesCollections.remove("Action")
        println(removedActionGames)
        println(videoGamesCollections)

//        authenticationHeaders["Authorization"] = "new api key"
        videoGamesCollections["Strategy"]?.add("Command & Conquer")
        videoGamesCollections["Shooter"] = mutableListOf("DDOM")
        for (key in videoGamesCollections.keys) {
            println(key)
        }

        for (value in videoGamesCollections.values) {
            println(value)
        }

//        for(entry in videoGamesCollections){
//            val (key, value) = entry
//        }
        for ((key, value) in videoGamesCollections) {
            println("Video games in the $key genre you own are: $value")
        }
    }

    @Test
    fun challenge4_1() {
        val animalMap = mutableMapOf(
            "Remona" to "darksHootDog",
            "Max" to "GermanShepardDog"
        )
        animalMap.toMutableMap()
        animalMap["DDalki"] = "hihiDog"
        animalMap.remove("DDalki")

        for ((name, kind) in animalMap) {
//           println("My animal name is $name, kind is $kind")
            println("The pet $name is $kind")
        }
    }

    @Test
    fun test4_2() {
        val userIds = setOf("ID1B", "ID2C", "ID3F", "ID4I")
        println(userIds)

        println(userIds.contains("ID3F"))
        println("ID3F" in userIds)

        val mutableIds = userIds.toMutableSet()
        println(mutableIds.add("ID0Z"))
        println(mutableIds)

        println(mutableIds.add("ID1B"))
        println(mutableIds)

        println(mutableIds.remove("ID1B"))
        println(mutableIds)

        for (userId in mutableIds) {
            println(userId)
        }

        val names = arrayOf("Philip", "Mark", "Brian", "Joe", "Ted", "John", "Philip")
        for (name in names) {
            print("$name, ")
        }
        println()
        val uniqNames = names.toSet()
        println(uniqNames)
    }

    @Test
    fun challenge4_2() {
        val strings = arrayListOf(
            "item1",
            "item2",
            "item3",
            "item4",
            "item1",
            "item2",
            "item3",
            "item4",
            "item1",
            "item2"
        )
        val stringsSet = strings.toMutableSet()
        println(stringsSet.remove("item1"))
        for (s in stringsSet) {
            println(s)
        }
    }

    @Test
    fun test5_1() {
        fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false): IntRange {
            if (isHalfOpen) {
                return start until end
            } else {
                return start..end
            }
        }

        fun printRange(range: IntRange) {
            for (number in range) print("$number \t")
            println()
        }

        val classRange = createRange(1, 10)
//        for(number in classRange) print("$number \t")
        printRange(classRange)
        val halfOpenClassRange = createRange(1, 10, true)
        printRange(halfOpenClassRange)

        val usingNamedArguments = createRange(isHalfOpen = true, end = 15, start = 1)
        printRange(usingNamedArguments)

        printRange(createRange(3, 6, isHalfOpen = true))
    }

    @Test
    fun test5_2() {
        fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false): IntRange =
            if (isHalfOpen) {
                start until end
            } else {
                start..end
            }

        fun createRange(start: Char, end: Char, isHalfOpen: Boolean = false): CharRange =
            if (isHalfOpen) {
                start until end
            } else {
                start..end
            }

        fun printRange(range: IntRange) {
            for (number in range) print("$number \t")
            println()
        }

        fun printRange(range: CharRange) {
            for (number in range) print("$number \t")
            println()
        }


        val classRange = createRange(1, 10)
//        for(number in classRange) print("$number \t")
        printRange(classRange)
        val halfOpenClassRange = createRange(1, 10, true)
        printRange(halfOpenClassRange)

        val usingNamedArguments = createRange(isHalfOpen = true, end = 15, start = 1)
        printRange(usingNamedArguments)

        printRange(createRange(3, 6, isHalfOpen = true))

        val charRange = createRange('A', 'Z')
        printRange(charRange)

        fun parseCoordinates(input: String): Pair<Double, Double> {
            val latitudeLongitude = input.split(",")

            val latitude = latitudeLongitude[0].toDouble()
            val longitude = latitudeLongitude[1].toDouble()

            return latitude to longitude
        }

        val (latitude, longitude) = parseCoordinates("45.46, 18.62")
        println("THe latitude is: $latitude, and the longtitude is :$longitude")
    }
}
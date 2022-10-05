package com.gaeng0517.basic

fun main() {
    //3. String Template
    val name = "gaeng"
    println("my name is ${name} I'm 31")

    checkNum(1)
}

//1. 함수
fun add(a: Int, b: Int): Int {
    return a + b
}

//2. val VS var
fun valVSvar() {
    val a: Int = 10
    var b: Int = 9

    //타입 추론
    val c = 100
    var d = 120
    var name = "gaeng"
}

//4. 조건식
fun maxBy(a: Int, b: Int) = if (a > b) a else b
fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression VS statement

//5. Array and List
// Array
// List 1.List 2.MutableList
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    array[0] = 3

    //error
    //list[0] = 2

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

    //error
    //array = arrayListOf<Int>()
}

//6. for / while
fun forAndWhile() {
    val students = arrayListOf("kaylee", "jenny", "joyce")

    for (student in students) {
        println("${student}")
    }

    var sum: Int = 0
    for (i in 1..10 step 2) {
        sum += 1
    }
    for ((index, name) in students.withIndex()) {
        println("${index + 1} 번쨰 학생: ${name}")
    }

    println(sum)

    var index = 0
    while (index < 10) {
        println("current index: ${index}")
        index++
    }
}

//7. Nullable / NonNull
fun nullCheck() {
    //NPE: Null Pointer Exception
    var name: String = ""
    var nullableName: String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullableName?.toUpperCase()

    // ?: 앨비스연산자
    val lastName: String? = null
    val fullName = name + (lastName ?: "No lastName")

    // !!

    // let
    val email: String? = "joycehongXXXX@nana.com"
    email?.let {
        println("my email is $it")
    }
}

fun ignoreNulls(str: String?) {
    val mNotnull: String = str!!
    val upperNotnull = mNotnull.toUpperCase()
}
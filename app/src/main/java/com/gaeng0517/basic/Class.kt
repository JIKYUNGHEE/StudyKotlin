package com.gaeng0517.basic

open class Human (val name: String = "Anonymous") {
    init {
        println("New")
    }

    constructor(name: String, age: Int = 0) :this(name) {

    }

    fun eatingCake() {
        println("This is YUMMY~")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human() {
    override fun singASong() {
        super.singASong()
        println("랄라랄")
    }
}

fun main() {
    val human = Human("gaeng")
    human.eatingCake()

    println("this human's name is ${human.name}")
}
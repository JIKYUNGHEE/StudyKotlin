package com.gaeng0517.basic

class Book private constructor(val id: Int, val name: String) {
    companion object BookFactory : IdProvider {
        val myBook = "new book"

        fun create() = Book(0, "gaeng book")
        override fun getId(): Int {
            return 555
        }
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    val book = Book.create()
}
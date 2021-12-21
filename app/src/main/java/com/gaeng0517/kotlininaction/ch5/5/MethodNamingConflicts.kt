package com.gaeng0517.kotlininaction.ch5.`5`

class MethodNamingConflicts {
    override fun toString(): String {
        print("this is method in class")
        return "this is method in class"
    }

    fun alphabet() = with(StringBuilder()) {
            for(letter in 'A'..'Z') {
                append(letter)
            }
            append("\nNow I know the alphabet!")
            toString()

            this@MethodNamingConflicts.toString()
        }
    }

fun main() {
    val test = MethodNamingConflicts()
    print(test.alphabet())
}
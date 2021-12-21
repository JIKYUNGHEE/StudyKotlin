package com.gaeng0517.kotlininaction.ch5.`5`

fun alphabet() = StringBuilder().apply {
    for(letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
}.toString()
//5.19 apply 를 사용해 알파벳 만들기


fun main() {
    print(alphabet())
}
package com.gaeng0517.kotlininaction.ch3.`5`

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("dir: $directory, name: $fileName, ext: $extension")
}
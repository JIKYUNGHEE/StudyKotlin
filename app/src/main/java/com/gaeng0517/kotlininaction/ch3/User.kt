package com.gaeng0517.kotlininaction.ch3

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    //TODO. user 를 db 에 저장한다.
}
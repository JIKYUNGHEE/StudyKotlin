package com.gaeng0517.kotlininaction.ch3.`6`

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun User.validateBeforeSave() {
        fun validate(
            value: String,
            fieldName: String
        ) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("Can't save user $id : $fieldName")
            }
        }

        validate(name, "Name")
        validate(address, "Address")
    }

    user.validateBeforeSave()

    //TODO. user 를 db 에 저장한다.
}
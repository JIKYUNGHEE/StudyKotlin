package com.gaeng0517.kotlininaction.ch3

class User(val id:Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : $fieldName")
        }
    }

    //FIXME. user 객체를 로컬함수에 계속 전달해야 함!
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    //TODO. user 를 db 에 저장한다.
}
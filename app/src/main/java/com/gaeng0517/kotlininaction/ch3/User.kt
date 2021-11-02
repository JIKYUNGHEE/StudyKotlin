package com.gaeng0517.kotlininaction.ch3

class User(val id:Int, val name: String, val address: String)

fun saveUser(user: User) {
    //검증 코드의 중복
    if(user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id} : empty Name")
    }

    if(user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id} : empty Address")
    }

    //TODO. user 를 db 에 저장한다.
}
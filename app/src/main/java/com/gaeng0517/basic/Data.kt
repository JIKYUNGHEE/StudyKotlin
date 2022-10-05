package com.gaeng0517.basic

//POJO
data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)
//toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("KoraenAir", "gaeng", "2022-10-05", 14)
}
package com.example.myapplication

class Person(val name: String, val age: Int, quequan: String) {
    var isAdult: Int = 0
        get(){
            return if (age >= 18) 1 else 0

        }

}
data class Person1(val name: String, val age: Int)

fun main() {
    val person = Person("John", 25, "HN")
    person.isAdult=5 //ko lien quan
    println(person.isAdult)

}


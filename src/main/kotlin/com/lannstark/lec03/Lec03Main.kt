package com.lannstark.lec03

fun main() {
    println("hello")
    printAgeIfPerson(null)
}
fun printAgeIfPerson(obj : Any?) {
    if(obj is Person)
    println(obj.age)
}

package com.lannstark.lec02

import java.lang.IllegalArgumentException

fun main() {

}

fun startsWithA(str : String?) : Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str : String?) : Boolean? {
    return str?.startsWith("A")
}
fun startsWithA3(str : String?) : Boolean {
    return str?.startsWith("A") ?: false
}

fun startWithA4 (str : String) : Boolean {
    return str.startsWith("A")
}

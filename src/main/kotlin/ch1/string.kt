package org.example.ch1

import java.util.*

fun main() {
    var name = "hello"
    println(name.uppercase())
    println(name)

    var name2 = "wonjun";


    // 기존 자바에서는?
    println("제 이름은 " + name2 + "입니다.")

    // kotlin
    println("제 이름은 ${name2}입니다.")
}

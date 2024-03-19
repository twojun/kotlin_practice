package org.example.example

import kotlin.random.Random

fun main() {
    var randomNumber = Random.nextInt(0, 100)  // 0 ~ 99
    var randomDoubleNumber = Random.nextDouble(0.0, 2.2)
    print(randomNumber)
    print(randomDoubleNumber)
}
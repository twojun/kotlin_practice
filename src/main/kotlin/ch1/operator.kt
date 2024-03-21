package org.example.ch1

/**
 *  kotlin의 경우 동일성(주소) 비교에  ===, 동등성 비교에 ==
 *  java의 경우 동일성 비교에 ==, 동등성 비교에 equals()
 */
fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 == money2)  // true
    println(money1 === money3) // false
    println(money1 === money2) // true
    println(money1 == money3)  // true
}
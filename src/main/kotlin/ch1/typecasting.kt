package org.example.ch1

fun main () {
    var num1 = 10
    var num2 = 20L

    // 타입이 다르면 대입할 수 없음
//    num2 = num1;
    num2 = num1.toLong()

    // Type-casting
    var name = ""
    name = num1.toString()
    num1 = name.toInt()

}
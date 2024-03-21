package org.example.ch1

fun main() {
    val person = Person("wonjun", 20)
    // System.out.println(String.format("이름 : %s", person.name));

    println("이름 : ${person.name}")

    val str = "ABCD"
    println(str[0])
    println(str[3])
}
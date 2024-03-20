package org.example.ch1

/**
 * 코틀린에서는 null이 가능한 타입, 불가능한 타입에 대해 완전히 다르게 취급한다.
 * null만을 위한 기능은 없을까? : Safe call, Elvis 연산자
 *
 * (1) Safe call
 * (2) elvis operator
 */

fun main() {

    val str: String? = "ABC";
//    println(str.length);
    println(str?.length);   // str 변수가 null이 아닌 경우에 이후 연산을 실행


    // elvis
    val str2: String? = null
    println(str2?.length ?: 0) // 0
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.");
    }
    return str.startsWith("A")
}

fun afterStartsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?) : Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun afterStartsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun afterStartsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}
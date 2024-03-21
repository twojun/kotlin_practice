package org.example.ch1

/**
 * value is Type : value가 Type이면 true, 아니라면 false
 * value !is Type : 반대
 *
 * value as Type : value가 Type이면 Type으로 type-casting 아니라면 ClassCastException
 * value as? Type : value가 null이면 전체 null, value가 Type이 아니라면 null
 *
 * Any : Java의 Object(모든 객체의 최상위 타입), primitive type의 최상위 타입도 Any
 */
fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()   // type-casting 시 명시적 변환 필요
    println(number1 + number2)

    printAgeIfPerson2(null)
    printAgeIfPerson2(Person("wonjun", 20))
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person: Person? = obj as? Person  // obj가 Person이 아니라면 person = null, 그렇지 않은 경우에는 person 객체의 age 속성을 출력
    println(person?.age)
}
package org.example.example

fun main() {
    var number: Int = 5
    var boolCond = if (number > 5) true else false

    if (number > 10) {
        print("10보다 크다.")
    } else if (number > 5) {
        print("5보다 크다.")
    } else {
        print("아무것도 해당되지 않는다.")
    }

    when {
        number > 10 -> {
            print("10보다 크다.")
        }
        number > 5 -> {
            print("5보다 크다.")
        }
        else -> {
            print("아무것도 해당되지 않는다.")
        }
    }

    print(boolCond)


    val data: Any = "Hello, World!"
    when (data) {
        is String -> println("data is a String: $data")
        is Int -> println("data is an Int: $data")
        is Boolean -> println("data is a Boolean: $data")
        else -> println("data is something else: $data")
    }
    print(data);

}

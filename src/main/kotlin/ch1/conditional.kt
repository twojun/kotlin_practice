package org.example.ch1

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
}

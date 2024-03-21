package org.example.ch1

class JavaMoney(val money: Long) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as JavaMoney

        return money == other.money
    }

    override fun hashCode(): Int {
        return money.hashCode()
    }
}
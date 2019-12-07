package com.example

fun main() {
    fun Int.toStringWithSeparator(): String {
        return this.toString().reversed().withIndex()
                        .map {it.value + if ((it.index-1) % 3 == 2) "," else ""}
                        .reversed()
                        .joinToString(separator = "")
    }
    println(1234567890.toStringWithSeparator())
}

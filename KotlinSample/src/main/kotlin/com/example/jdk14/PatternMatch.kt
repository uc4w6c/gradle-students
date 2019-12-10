package com.example.jdk14

fun main() {
    val o: Any = "Pattern Match of instanceof"
    if (o is String) {
        val s:String = o
        println(s)
    }

    when(o) {
        is Int -> println("Int")
        is String -> {
            val s:String = o
            println(s)
        }
    }
}

package com.example.jdk12

fun main() {
    val s = "";
    val n: String? = null;
    if (s.isEmpty()) {
        println("s is Empty")
    }
    if (n.isNullOrEmpty()) {
        println("n is Null")
    }
}

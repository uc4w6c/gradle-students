package com.example.jdk12

fun main() {
    fun listToMap(list: List<String>): Map<String, Int> {
        return mutableMapOf(list.joinToString(",") to list.count())
    }
    val list = mutableListOf("aaa", "", "bbb", "ccc")
                    .filter { !it.isBlank() }
                    .toList()
    println(listToMap(list))
}

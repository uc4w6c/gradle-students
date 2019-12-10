package com.example.jdk14

fun main() {
    data class Point(val x: Int, val y: Int)
    val point1 = Point(5, 10)
    val point2 = Point(5, 10)
    println(point1.x)
    println(point1)
    println(point1.equals(point2))
}

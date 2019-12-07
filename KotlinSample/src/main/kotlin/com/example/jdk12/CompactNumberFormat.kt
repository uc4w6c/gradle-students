package com.example.jdk12

import kotlin.math.pow
import kotlin.math.floor

fun main() {
    fun format(number: Long): String {
        return when {
            (number >= 10F.pow(12)) -> {
                floor(number / 10F.pow(12)).toLong().toString() + "兆"
            }
            (number >= 10F.pow(8)) -> {
                floor(number / 10F.pow(8)).toLong().toString() + "億"
            }
            (number >= 10F.pow(4)) -> {
                floor(number / 10F.pow(4)).toLong().toString() + "万"
            }
            else -> {
                number.toString()
            }
        }
    }
    println(format(10000))
    println(format(10000_0000))
    println(format(10000_0000_0000L))
}

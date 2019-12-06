package com.example

fun main(args: Array<String>) {
    val s = "OCEAN"
    val releaseYear = when(s) {
        "ultra soul" -> "2001";
        "OCEAN" -> "2005";
        else -> "";
    }
    println(releaseYear)
}

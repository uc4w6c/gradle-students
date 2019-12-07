package com.example

fun main(args: Array<String>) {
    // val s = "OCEAN"
    val s = "ARIGATO"
    val releaseYear = when(s) {
        "ultra soul" -> "2001";
        "BANZAI", "ARIGATO" -> "2004";
        "OCEAN" -> "2005";
        else -> "";
    }
    println(releaseYear)
}

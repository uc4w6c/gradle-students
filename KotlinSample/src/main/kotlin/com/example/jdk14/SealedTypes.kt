package com.example.jdk14

fun main() {
    val hondaCar: HondaCar = Demio()
    val hondaName = when(hondaCar) {
        is Demio -> "Demio"
        is Vezel -> "Vezel"
    }
    println(hondaName)

    val nissanCar: NissanCar = Leaf()
    /*
    val nissanName = when(nissanCar) {
        is Leaf -> "Leaf"
        is Juke -> "Juke"
    }
    println(nissanName)
    */
}

sealed class HondaCar
class Demio: HondaCar()
    // fun getName():String { return "Demio" }

class Vezel: HondaCar()
    // fun getName():String { return "Vezel" }


interface NissanCar
class Leaf: NissanCar{
    fun getName():String { return "Leaf" }
}
class Juke: NissanCar {
    fun getName():String { return "Juke" }
}

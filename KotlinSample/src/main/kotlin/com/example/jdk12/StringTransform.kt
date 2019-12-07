package com.example.jdk12

fun main() {
    /*
    fun String.transform(f: (String) -> String): String {
        return f(this)
    }
    */
    fun <R> String.transform(map: Map<String, R>): R? {
        return map.get(this)
    }

    val addresses = mapOf("Mike" to "Fukuoka", "John" to "Tokyo")
    val population = mapOf("Tokyo" to 30000000, "Fukuoka" to 2000000)
    val name = "Mike"
    // println(population.get(addresses.get(name)))

    println(name.transform(addresses)?.transform(population))
    // 一応これはOKだった
    // println(name.transform(fun(name: String): String {return name} ))
}

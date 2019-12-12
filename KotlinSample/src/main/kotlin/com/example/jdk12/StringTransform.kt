package com.example.jdk12

fun main() {
    /*
    fun String.transform(f: (String) -> String): String {
        return f(this)
    }
    */
    // fun <R> String.transform(map: Map<String, R>): R? {
    //     return map.get(this)
    // }

    val addresses = mapOf("Mike" to "Fukuoka", "John" to "Tokyo")
    val population = mapOf("Tokyo" to 30000000, "Fukuoka" to 2000000)
    val name = "Mike"
    // println(population.get(addresses.get(name)))

    // 教えてもらった！！
    println(name.transform(addresses::get)?.transform(population::get))
    // 一応これはOKだった
    // println(name.transform(fun(name: String): String {return name} ))
}

inline fun <R> String.transform(transform: (String) -> R): R {
    return transform(this)
}
// inline fun <T, R> T.transform(transform: (T) -> R): R {
//     return transform(this)
// }

package com.example.jdk11

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.charset.StandardCharsets
fun main() {
    val httpClient = HttpClient.newBuilder().build()
    val httpRequest = HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create("https://www.yahoo.co.jp/"))
                        .build()
    var response = httpClient.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8))
    println("status:" + response.statusCode())
    println("body:" + response.body())
}

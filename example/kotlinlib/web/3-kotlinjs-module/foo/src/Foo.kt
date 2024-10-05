package foo

import kotlin.js.Json
import kotlinx.html.h1
import kotlinx.html.stream.createHTML

fun main(args: Array<String>) {
    println(hello())

    val parsedJsonStr = JSON.parse<Json>("""{"helloworld": ["hello", "world", "!"]}""")
    val stringifiedJsObject = JSON.stringify(parsedJsonStr["helloworld"])
    println("stringifiedJsObject: " + stringifiedJsObject)
}

fun hello(): String = createHTML(prettyPrint = false).h1 { text("Hello World")  }.toString()

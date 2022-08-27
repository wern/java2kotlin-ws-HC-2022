package javakotlinworkshop.kotlin

import java.nio.charset.Charset

fun main(args: Array<String>) {

    val a = "Hallo KKON"
    val b = String(a.toByteArray(Charset.defaultCharset()),
            Charset.defaultCharset())

    // referential equality
    println(String.format("a === b: %b", a === b))

    // structural equality
    println(String.format("a == b: %b", a == b))
}
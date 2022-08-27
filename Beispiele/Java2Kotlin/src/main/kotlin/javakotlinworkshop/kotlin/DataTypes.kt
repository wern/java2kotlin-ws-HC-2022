package javakotlinworkshop.kotlin

fun main(args: Array<String>) {

    val a = 123.45f
    val b = 123.45
    val c = 1L
    val d = 2
    val e = 3.toShort()
    val f = 4.toByte()
    val g = true

    printClassName(a)
    printClassName(b)
    printClassName(c)
    printClassName(d)
    printClassName(e)
    printClassName(f)
    printClassName(g)
}

fun printClassName(num: Any) {
    println(num::class.qualifiedName)
}

package javakotlinworkshop.kotlin

fun main(args: Array<String>) {
    var s1 = "Hello"
    println(s1.length)

    val stringThatCanBeNull: String? = null
    try {
        println(stringThatCanBeNull!!.length)
    } catch (e: NullPointerException) {
        println("Crash")
    }

    println(stringThatCanBeNull?.length ?: -1)
}
package javakotlinworkshop.kotlin

fun main(args: Array<String>) {
    val num = (Math.random() * 4).toInt()
    println("$num ist ${if (isEven(num)) "gerade" else "ungerade"}")

    // branch conditions may also be combined with a comma
    // ranges can be checked like this: in 1..10
    when (num) {
        0 -> println("0")
        2 -> println("2")
        else -> println("1 oder 3")
    }

    val person = object {
        val name = null
    }
    val s = person.name ?: "???"
    println(s)
}

fun isEven(num: Int): Boolean {
    return (num % 2) != 1
}
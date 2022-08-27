package javakotlinworkshop.kotlin

fun main(args: Array<String>) {
    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val array = arrayOf("Eins", "Zwei", "Drei")
    for (i in array.indices) {
        println(array[i])
    }

    val list = listOf("Eins", "Zwei", "Drei")
    for (i in list) {
        println(i)
    }

    list.forEach { println(it) }

    var i = 0
    while (i++ < 3) {
        println(i)
    }
}
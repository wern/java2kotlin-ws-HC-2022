package javakotlinworkshop.kotlin

fun main(args: Array<String>) {
    ConstructorDemo()
}

class ConstructorDemo(name: String) {
    val first = "First property: $name".also(::println)

    init {
        println("First block: ${name}")
    }

    val second = "Second property: ${name.uppercase()}".also(::println)

    init {
        println("Second block can access $second")
    }

    constructor() : this("Hallo") {
        println("secondary construcotr called")
    }
}
package javakotlinworkshop.kotlin

fun main(args: Array<String>) {
    A()
    B()
}

open class A {

    init {
        println("A")
    }
}

class B : A() {

    init {
        println("B")
    }
}
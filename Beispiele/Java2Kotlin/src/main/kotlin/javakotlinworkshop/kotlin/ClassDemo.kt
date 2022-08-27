package javakotlinworkshop.kotlin

fun main(args: Array<String>) {
    val person = Person("John", 50)
    person.name = "Max"
    person.age = 42
    print(person)
}

fun print(person: Person) {
    println("${person.name}, ${person.age}")
}

class Person(var name: String, var age: Int)



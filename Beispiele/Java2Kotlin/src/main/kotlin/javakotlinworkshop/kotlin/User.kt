package javakotlinworkshop.kotlin

fun main() = println(Administrator.login)

open class TutorialPerson(val name : String, val vorname : String)

open class User (name : String, vorname : String, val login : String, val passwort : String) : TutorialPerson(name, vorname)

object Administrator : User("Max", "Huber","root", "****")
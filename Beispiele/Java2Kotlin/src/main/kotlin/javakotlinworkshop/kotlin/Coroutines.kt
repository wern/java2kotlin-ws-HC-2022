package javakotlinworkshop.kotlin

// Import needed!
import kotlinx.coroutines.*

fun main() = runBlocking {
/*
    launch {
        delay(1000L)
        println("Nürnberg!")
    }
    println("Hallo")
*/
    // launch
    Coroutines().helloWorlds()

    // async-await
    Coroutines().countParticipants()
}

class Coroutines {
    fun hello() = runBlocking {
        launch {
            delay(1000L)
            println("Nürnberg!")
        }
        println("Hallo")
    }

    fun helloWithFun() = runBlocking {
        launch {
            delayedWorld()
        }
        println("Hallo")
    }

    fun helloWorlds() = runBlocking {
        delayedWorlds()
        println("Fertig :)")
    }

    fun helloWithJob() = runBlocking {
        val job = launch {
            delayedWorld()
        }

        println("Hallo")
        job.join()
        println("Fertig :)")
    }

    fun countParticipants() = runBlocking {
        val audience = async { countAudience() }
        val presenter = async { countPresenter() }
        println("${audience.await()} Zuhörer und ${presenter.await()} Sprecher anwesend.")
    }

    suspend fun delayedWorld() {
        delay(1000L)
        println("Nürnberg!")
    }

    suspend fun delayedWorlds() = coroutineScope {
        launch {
            delay(2000L)
            println("Nürnberg")
        }

        launch {
            delay(1000L)
            println("Herbstcampus")
        }
        println("Hallo")
    }

    suspend fun countAudience() : Int{
        delay(1000L)
        return 14
    }

    suspend fun countPresenter() : Int{
        delay(500L)
        return 1
    }
}
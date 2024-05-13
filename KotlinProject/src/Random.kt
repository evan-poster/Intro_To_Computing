import kotlin.random.Random

fun main() {
    var lastNumber = 0

//    print("Enter a number")
//    var userInput = readln().toInt()

    for( i in 1..10) {
        lastNumber = Random.nextInt(lastNumber+1, lastNumber + 100)
        println(lastNumber)
    }
}

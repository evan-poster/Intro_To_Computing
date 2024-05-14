package week1

fun main() {
    print("Enter something: ")
    val userInput = readLine() ?: ""
    print("You said: $userInput")
}
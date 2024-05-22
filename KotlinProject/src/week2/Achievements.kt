package week2

import java.util.*

fun main(args: Array<String>) {
    // Achievements.ask();
    val dictionary: MutableMap<String, String> = TreeMap()

    // Adding key-value pairs to the dictionary
    dictionary["Boole"]         = "Boolean Logic"
    dictionary["De Morgan"]     = "De Morgan's Law"
    dictionary["Shannon"]       = "Theorize Logic"
    dictionary["Atanasoff"]     = "Theorize Digital Comp"
    dictionary["Mauchly"]       = "UNIVAC"
    dictionary["Von Neumann"]   = "Computer Architecture"

    while(true) {
        print("Enter an name: ")
        val userInput = readLine()
        if (userInput == "q") {
            break
        }
        println(dictionary.getOrDefault(userInput, "Name not found"))
    }
}
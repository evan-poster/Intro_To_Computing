package week2

import java.util.*

// Ex2: Reimplement the second code snippet with Kotlin or Python

fun main(args: Array<String>) {
    // print all lines on standard input that contain a string specified as a command-line argument
    val scanner = Scanner(System.`in`)
    val query = args[0]

    while (scanner.hasNextLine()) {
        val line = scanner.nextLine()
        if (line.contains(query)) {
            println(line)
        }
    }
}

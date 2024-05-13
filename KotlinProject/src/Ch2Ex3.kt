// Chapter 2/Exercise3.kt

// Ex3: similar to Ex1, use Kotlin's native if/else syntax

fun newMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    println(newMax(78, 6))
}

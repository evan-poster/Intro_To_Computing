// generic functions parameters

fun <T: Comparable<T>> newMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {
    println(newMax(3, 5))
}

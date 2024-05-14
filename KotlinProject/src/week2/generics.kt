package week2// generic functions parameters

// See JavaUtil.whichIsBigger for java-equivalent
fun <T: Comparable<T>> genericMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {
    println(genericMax(3, 5))
    println(JavaUtil.whichIsBigger(40,5))
}

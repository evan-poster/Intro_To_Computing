// Ex2: Reimplement the sorting algorithm listed on page 543 with Kotlin,
//      and write some tests to verify your implementation.
//
//      Note: compile your code on command line first, then run it via command line.

fun sortkt(a: Array<Int>) {
    val n = a.size
    // Sort items using insertion method
    for (i in 1 until n) {
        for (j in i downTo 1) {
            if (a[j - 1].compareTo(a[j]) > 0) {
                val temp = a[j - 1]
                a[j - 1] = a[j]
                a[j] = temp
            } else break
        }
    }
}

fun main() {
    // Test with random numerical data
    val a = Array(10) { (Math.random() * 100).toInt() }

    // Show initial array
    println(a.joinToString())

    // Run the sort
    sortkt(a)

    // Provide sorted array for review
    println(a.joinToString())
}

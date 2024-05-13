// Ex 3: reimplement Harmonic sequence ( please refer to page 65 of our textbook).
// The number of elements of the sequence should come from the user input.
fun main(args: Array<String>) {
    val n = args[0].toInt()
    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    println(sum)
}

import java.math.BigDecimal

fun main() {
    var result = BigDecimal(0.0)
    val increment = BigDecimal(0.1)
    for (i in 1..10) {
        result += increment
    }
    print(result.toFloat())
}

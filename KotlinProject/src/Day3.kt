
fun main() {
    val name = "john smith"
    println(name.title())
}

// Function extension
fun String.title(): String {
    val words = this.split(" ")
    val result = StringBuilder()
    for (word in words) {
        result.append(word[0].uppercase() + word.substring(1) + " ")
    }
    return result.trim().toString()
}

fun whoIsBigger( n1: Int, n2: Int) = if (n1 > n2) n1 else n2

fun whoIsSmaller( n1: Int, n2: Int) = if (n1 < n2) n1 else n2

fun whoIsBigger( n1: IntArray ): Int {
    var result = n1[0]
    for (i in 1 until n1.size) {
        if ( n1[i] > result ) {
            result = n1[i]
        }
    }
    return result
}

fun whoIsSmaller( n1: IntArray ): Int {
    var result = n1[0]
    for (i in 1 until n1.size) {
        if ( n1[i] < result ) {
            result = n1[i]
        }
    }
    return result
}

// Nested Functions
fun funWithinFun (age: Int, name: String, email: String): Boolean {
    fun checkAge(age: Int) = age >= 0
    fun checkName(name: String) = name.isNotEmpty()
    fun checkEmail(email: String) = email.contains("@")

    return checkAge(age) && checkName(name) && checkEmail(email)
}

package week2

// Ex3: Reimplement the third code snippet with either Kotlin or Python

// is the string a palindrome?
fun isPalindrome(s: String): Boolean {
    val n = s.length
    for (i in 0 until n / 2) {
        if (s[i] != s[n - 1 - i]) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isPalindrome("asdffdsa"))   // True
    println(isPalindrome("zzii"))       // False
}

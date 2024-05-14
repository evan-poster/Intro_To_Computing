package week1// Chapter 2/Exercise4.kt

// Ex4: create a maxN function such that it takes an array and returns its largest element.

fun Ch2Ex4(a: Array<Int>): Int {
    var result = a[0]
    for (i in 1..a.size-1) {
        if (a[i] > result) {
            result = a[i]
        }
    }
    return result
}

fun main() {
    println(Ch2Ex4(arrayOf(1,2,3,5,6,100,9)))
}

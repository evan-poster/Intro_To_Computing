package week1
fun main() {
    var nullableVar :String? = null
    nullableVar = "5"
    if (nullableVar.equals("5")) {
        println("Can you even get here?")
    }

    var X : String = "abc"
    var Y : String = "ab"

    if ( X == Y + "c" ) {
        println("equals")
    } else {
        println("not equal")
    }
}

package week2

// Lambda functions

fun main() {
    // Without lambdas
    val names = listOf("john", "jack", "jim")
    val Names = mutableListOf<String>()
    for (name in names) {
        Names.add(name[0].uppercase() + name.substring(1))
    }
    println("Upper case names w/for loop: $Names")

     // With lambdas
    // { args : <code> }
    // map(){<code>}
    // map {<code/lambda>}
    // can use 'it' as an implied keyword for simplicity. Will always reference object.
    println(names.map { str -> str[0].uppercase() + str.substring(1) })
    println(names.map() {it[0].uppercase() + it.substring(1)} )
    println(names.map() {it[0].uppercase().plus(it.substring(1))} )
    println(names.map {it[0].uppercase() + it.substring(1)} )
    println(names)
}

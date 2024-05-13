

fun main() {
    val name = "peter"
    val name2 = "john"

    val sb = StringBuffer(name)
    sb.append(name2)

    println(name + name2)
    println("$name$name2")
    println(sb)
    println(StringBuilder().append(name).append(name2))

    val myArray = arrayOf(1, 2, "3")
    println(myArray.joinToString())
}

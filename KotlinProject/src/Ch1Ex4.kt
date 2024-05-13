// Ex 4: reimplement a random sequence numbers ( refer to page 128 of our textbook)

fun main(args: Array<String>) {
    if ( args.isNotEmpty() ) {
        var count = args[0].toInt() ?: 0
        do {
            println(Math.random())
            count -= 1
        } while ( count != 0 )
    }
}

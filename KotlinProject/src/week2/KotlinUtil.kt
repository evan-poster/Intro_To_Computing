package week2

class KotlinUtil {

    companion object {
        @JvmStatic
        fun comp_hello() {
            println("hello from KotlinUtil (companion)")
        }
    }

    fun hello() {
        println("Hello from KotlinUtil (instance)")
    }

    fun sentenceCase(message: String): String {
        return message[0].uppercase() + message.substring(1)
    }

}

fun main() {
    JavaUtil.hello()
}

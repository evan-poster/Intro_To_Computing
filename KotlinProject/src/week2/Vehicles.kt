package week2

open class Vehicle {
    var weight = 1000

    open fun honk() {
        println("A vehicle honks")
    }
}

class Car : Vehicle() {
    override fun honk() {
        println("A car honks")
    }
}

fun main() {
    val ju = JavaUtil()
    // JavaUtil ju = new JavaUtil()

    // Create our objects
    val obj1 = Vehicle()
    val obj2 = Car()

    // HONK
    obj1.honk()
    obj2.honk()

    // Show our object data
    println(obj1.weight)
    println(obj2.weight)

    Vehicles.honk()
    Cars.honk()
}

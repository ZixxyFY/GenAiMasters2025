fun welcomeCoffee(coffeeType: String): String {
    return "Enjoy your $coffeeType!"
}

fun main() {
    val message = welcomeCoffee("Latte")
    println(message)
}

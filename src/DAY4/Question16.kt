package DAY4

fun isValidCoffeeType(type: String?): Boolean {
    val validTypes = listOf("Latte", "Espresso", "Mocha", "Cappuccino")
    return type != null && type in validTypes
}
fun main() {
    println(isValidCoffeeType("Mocha"))
    println(isValidCoffeeType(null))
}

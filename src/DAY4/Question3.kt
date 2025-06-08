package DAY4

data class CoffeeOrder(val type: String, val size: String)

fun main() {
    val order = CoffeeOrder("Latte", "Medium")
    println("Order Summary: ${order.type}, Size: ${order.size}")
}

package DAY4

fun countUniqueOrders(orders: Set<String>) {
    println("Unique orders: ${orders.size}")
}
fun main() {
    val orders = setOf("Latte", "Espresso", "Latte")
    countUniqueOrders(orders)
}

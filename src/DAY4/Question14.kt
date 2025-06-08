package DAY4

fun applyDiscount(prices: List<Double>): List<Double> {
    return prices.map { it * 0.9 }
}

fun main() {
    val prices = listOf(100.0, 200.0, 150.0)
    println("Discounted prices: ${applyDiscount(prices)}")
}

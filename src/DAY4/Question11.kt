package DAY4

fun getPriceBySize(size: String?): Double {
    return when (size?.lowercase()) {
        "small" -> 100.0
        "medium" -> 150.0
        "large" -> 200.0
        else -> 0.0
    }
}

fun main() {
    println("Price: ₹${getPriceBySize(null)}")
}

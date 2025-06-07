package DAY3

fun main() {
    val price = 6.5
    val category = when {
        price < 3 -> "Budget Brew!"
        price in 3.0..6.0 -> "Moderate Mug!"
        else -> "Premium Pour!"
    }
    println("Price category: $category")
}

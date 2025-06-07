package DAY3

fun main() {
    val caffeine = 65
    val strength = when (caffeine) {
        in 0..30 -> "Mild"
        in 31..70 -> "Medium"
        in 71..100 -> "Strong"
        else -> "Out of range"
    }
    println("Coffee strength: $strength")
}

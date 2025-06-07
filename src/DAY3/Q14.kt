package DAY3

fun main() {
    val temperature = 65
    val tempStatus = when {
        temperature < 50 -> "Cold Coffee?"
        temperature in 50..75 -> "It's Perfect"
        else -> "Too Hot"
    }
    println("Coffee temperature: $tempStatus")
}

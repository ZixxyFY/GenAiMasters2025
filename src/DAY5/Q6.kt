package DAY5

fun main() {
    try {
        val number = "abc".toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("Invalid number format")
    }
}

package DAY5

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evens = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evens") // [2, 4, 6]
}

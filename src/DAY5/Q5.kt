package DAY5

fun operateOnList(numbers: List<Int>, operation: (Int) -> Int): List<Int> {
    return numbers.map { operation(it) }
}
fun main() {
    val list = listOf(1, 2, 3)
    val squared = operateOnList(list) { it * it }
    println(squared) // [1, 4, 9]
}

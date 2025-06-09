package DAY5

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = operate(5, 3) { x, y -> x + y }
    println("Sum: $sum") // Output: Sum: 8
}

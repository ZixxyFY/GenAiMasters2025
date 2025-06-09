package DAY5

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
        0
    } finally {
        println("Execution done")
    }
}
fun main() {
    val result = divide(10, 0)
    println("Result: $result")
}

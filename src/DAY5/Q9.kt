package DAY5

fun safeDivide(a: Int, b: Int): Int {
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
    val result = safeDivide(10, 0)
    println("Result: $result")
}


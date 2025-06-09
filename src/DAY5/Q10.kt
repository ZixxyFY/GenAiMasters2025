package DAY5

class NegativeNumberException(message: String) : Exception(message)

fun checkPositive(num: Int) {
    if (num < 0) {
        throw NegativeNumberException("Number is negative: $num")
    } else {
        println("Number is positive: $num")
    }
}

fun main() {
    try {
        checkPositive(-5)
    } catch (e: NegativeNumberException) {
        println(e.message)
    }
}

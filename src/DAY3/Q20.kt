package DAY3

fun main() {
    for (order in 1..10) {
        if (order % 3 == 0) {
            println("Skipping decaf order #$order")
            continue
        }
        println("Regular order #$order served")
    }
}

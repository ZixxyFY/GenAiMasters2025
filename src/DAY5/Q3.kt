package DAY5

fun applyTwice(x: Int, op: (Int) -> Int): Int {
    return op(op(x))
}

fun main() {
    val result = applyTwice(3) { it * 2 }
    println(result)
}

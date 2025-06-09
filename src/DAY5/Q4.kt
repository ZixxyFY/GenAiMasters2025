package DAY5

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")
    val uppercased = names.map { it.uppercase() }
    println("Map: $uppercased")
    names.forEach { println("Hello, $it") }
}

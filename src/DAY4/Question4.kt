package DAY4

fun greetCustomer(name: String?): String {
    return "Hello, ${name ?: "Guest"}!"
}

fun main() {
    println(greetCustomer(null))
}

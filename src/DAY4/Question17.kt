package DAY4

data class CoffeeBean(val name: String, val roastLevel: String)

fun main() {
    val beans = listOf(
        CoffeeBean("Arabica", "Medium"),
        CoffeeBean("Robusta", "Dark")
    )
    beans.forEach { println("${it.name} - ${it.roastLevel}") }
}

package DAY4

data class CoffeeMenu(val items: List<String>) {
    fun printMenu() {
        items.forEach { println(it) }
    }
}
fun main() {
    val menu = CoffeeMenu(listOf("Latte", "Mocha", "Espresso"))
    menu.printMenu()
}

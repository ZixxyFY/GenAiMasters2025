package DAY3

fun main() {
    var inventory = 10
    do {
        println("Inventory: $inventory cups remaining")
        inventory--
    } while (inventory > 0)
}

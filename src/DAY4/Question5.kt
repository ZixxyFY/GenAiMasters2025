package DAY4

class CoffeeShop(val name: String) {
    fun printOpeningHours() {
        println("$name is open from 8 AM to 8 PM.")
    }
}

fun main() {
    val shop = CoffeeShop("BrewBuzz")
    shop.printOpeningHours()
}

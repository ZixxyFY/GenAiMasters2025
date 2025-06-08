package DAY4

class Customer(var loyaltyPoints: Int) {
    fun addPoints(points: Int) {
        loyaltyPoints += points
    }
}
fun main() {
    val customer = Customer(50)
    customer.addPoints(20)
    println("Total loyalty points: ${customer.loyaltyPoints}")
}

package DAY4

class CoffeeMachine(var status: String) {
    fun brew() {
        if (status == "On") println("Brewing coffee...")
        else println("Machine is Off")
    }
}
fun main() {
    val machine = CoffeeMachine("On")
    machine.brew()
}

package DAY5

fun getElementAtIndex(list: List<Int>, index: Int): Int? {
    return try {
        list[index]
    } catch (e: IndexOutOfBoundsException) {
        println("Index out of bounds")
        null
    }
}
fun main() {
    val list = listOf(1, 2, 3)
    val element = getElementAtIndex(list, 5)
    println("Element: $element")
}

package DAY3

fun main() {
    var cup1 = "Small"
    var cup2 = "Large"
    val temp = cup1
    cup1 = cup2
    cup2 = temp
    println("Cup1: $cup1, Cup2: $cup2")
}

package DAY3

fun main() {
    val day = 5
    val coffee = when (day) {
        1 -> "Start your week with an espresso.Let's go!"
        2 -> "Try a cappuccino today, okay!"
        3 -> "Midweek mocha might work!"
        4 -> "Thursday's flat white,sure!"
        5 -> "Frappe Friday fun!"
        6 -> "Saturday is fixed for iced coffee!"
        7 -> "Sunday decaf and delight!"
        else -> "Unknown day!"
    }
    println(coffee)
}

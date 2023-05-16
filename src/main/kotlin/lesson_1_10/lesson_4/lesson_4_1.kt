package lesson_1_10.lesson_4

const val ALL_TABLE_RESTAURANT = 13

fun main() {
    val reserveTableToday = 13
    val reserveTableTomorrow = 9

    println("Доступность столиков на сегодня: ${reserveTableToday != ALL_TABLE_RESTAURANT}\nДоступность столиков на завтра: ${reserveTableTomorrow != ALL_TABLE_RESTAURANT}")
}
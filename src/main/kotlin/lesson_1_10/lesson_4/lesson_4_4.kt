package lesson_1_10.lesson_4

fun main() {
    val numberDayGym = 5
    val findParityDay = numberDayGym % 2 == 0

    val trainingLegs = findParityDay
    val trainingArms = !findParityDay
    val trainingBack = findParityDay
    val trainingAbs = !findParityDay

    println("""Упражнения для рук: $trainingArms
              |Упражнения для ног: $trainingLegs
              |Упражнение для спины: $trainingBack
              |Упражнение для пресса: $trainingAbs""".trimMargin())
}
package lesson_4

fun main() {
    val trainingLegs = true
    val trainingArms = false
    val trainingBack = true
    val trainingAbs = false

    val numberDayGym = 5
    val findParityDay = numberDayGym % 2 == 0

    println("""Упражнения для рук: ${findParityDay == trainingArms}
              |Упражнения для ног: ${findParityDay == trainingLegs}
              |Упражнение для спины: ${findParityDay == trainingBack}
              |Упражнение для пресса: ${findParityDay == trainingAbs}""".trimMargin())
}
package lesson_4

const val TRAINING_LEGS = true
const val TRAINING_ARMS = false
const val TRAINING_BACK = true
const val TRAINING_ABS = false

fun main() {
    val numberDayGym = 5

    println("Упражнения для рук: ${(numberDayGym % 2 == 0) == TRAINING_ARMS}\nУпражнения для ног: ${((numberDayGym % 2 == 0) == TRAINING_LEGS)}\nУпражнение для спины: ${(numberDayGym % 2 == 0) == TRAINING_BACK}\nУпражнение для пресса: ${(numberDayGym % 2 == 0) == TRAINING_ABS}")
}
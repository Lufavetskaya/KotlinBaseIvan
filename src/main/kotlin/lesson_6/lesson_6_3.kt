package lesson_6

fun main() {
    println("Укажите количество секунд для таймера:")

    val secondsUser = readln().toUInt()
    var countSecondsUser = secondsUser

    do {
        println("Осталось секунд: $countSecondsUser")
        Thread.sleep(1000)
        countSecondsUser--
    } while (countSecondsUser > 0u)

    println("Время вышло")
}

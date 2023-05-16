package lesson_1_10.lesson_7

fun main() {
    println("Укажите таймер")
    var secondsFotTimer = readln().toInt()

    for (i in 1..secondsFotTimer) {
        println("Осталось ${secondsFotTimer--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
package lesson_6

fun main() {
    var numberForTry = 0
    val maxTry = 3

    println("Проверка на человека.\nРеши пример на сложение чисел от 1 до 9.")

    while (numberForTry < maxTry) {
        println("У тебя ${maxTry - numberForTry++} попытки")

        val firstSummand = (1..9).random()
        val secondSummand = (1..9).random()
        val sumTwoNumber = firstSummand + secondSummand

        println("А какова сумма?\n$firstSummand + $secondSummand =")

        val answerSum = readln().toInt()

        if (sumTwoNumber == answerSum) {
            println("Добро пожаловать!")
            break
        } else if (numberForTry == maxTry) println("Доступ запрещен")
        else println("again!")
    }

}
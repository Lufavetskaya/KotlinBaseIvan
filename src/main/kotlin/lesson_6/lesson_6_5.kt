package lesson_6

fun main() {
    var numberForTry = 0
    val maxTry = 3

    println("Проверка на человека.\nПридумай и реши пример на сложение чисел от 1 до 9.")

    while (numberForTry < 3) {
        println("Ввведи два слагаемых. У тебя ${maxTry - numberForTry++} попытки")

        val firstSummand = readln().toInt()
        val secondSummand = readln().toInt()
        val sumTwoNumber = firstSummand + secondSummand

        println("А какова сумма?\n$firstSummand + $secondSummand =")

        val answerSum = readln().toInt()

        if (sumTwoNumber == answerSum) {
            println("Добро пожаловать!")
            break
        } else if (sumTwoNumber != answerSum && numberForTry == maxTry) println("Доступ запрещен")
        else println("again!")
    }

}
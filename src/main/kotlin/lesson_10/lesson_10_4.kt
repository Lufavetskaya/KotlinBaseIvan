package lesson_10

var count = 0

fun main() {

    do {
        println("Ход человечества:")
        val sumHuman = rollDice()

        println("Ход ai:")
        val sumAI = rollDice()

        resultSumRoll(sumHuman, sumAI)

        println("Хотите бросить кости еще раз Введите Да или Нет")
        val goodAnswerForAdd = "Да"
    } while (readln() == goodAnswerForAdd)

    println("$count количества выйгрышных партий человека")
}

fun rollDice(): Int {
    val firstRoll = (1..6).random()
    val secondRoll = (1..6).random()

    roundGame(firstRoll, secondRoll)

    return sumRoll(firstRoll, secondRoll)
}

fun sumRoll(firstR: Int, secondR: Int): Int {
    return firstR + secondR
}

fun resultSumRoll(sum1: Int, sum2: Int) {
    if (sum1 > sum2) {
        println("Победило человечество")
        count++
    } else if (sum2 > sum1) println("Победила машина")
    else println("Победил баланс сил.")
}

fun roundGame(firstRoll: Int, secondRoll: Int) {
    println("первый куб - $firstRoll, второй - $secondRoll")
}

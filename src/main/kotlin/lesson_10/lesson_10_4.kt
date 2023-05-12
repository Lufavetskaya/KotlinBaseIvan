package lesson_10

var count = 0

fun main() {

    do {
        val firstRollHuman = rollDice()
        val secondRollHuman = rollDice()
        val firstRollAI = rollDice()
        val secondRollAI = rollDice()

        roundGame(firstRollHuman, secondRollHuman, firstRollAI, secondRollAI)
        resultSumRoll(sumRoll(firstRollHuman, secondRollHuman), sumRoll(firstRollAI, secondRollAI))

        println("Хотите бросить кости еще раз Введите Да или Нет")
        val answerUser = readln()
        val goodAnswerForAdd = "Да"
    } while (answerUser == goodAnswerForAdd)

    println("$count количества выйгрышных партий человека")
}

fun rollDice(): Int {
    return (1..6).random()
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

fun roundGame(firstRollHuman: Int, secondRollHuman: Int, firstRollAI: Int, secondRollAI: Int) {
    println("Ход человечества: первый куб - $firstRollHuman, второй - $secondRollHuman")
    println("Ход ai: первый куб - $firstRollAI, второй - $secondRollAI")
}

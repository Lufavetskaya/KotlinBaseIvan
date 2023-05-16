package lesson_10

fun main() {
    val firstRollHuman = rollDice().first
    val secondRollHuman = rollDice().second

    println("Ход человечества: первый куб - $firstRollHuman, второй - $secondRollHuman")

    val firstRollAI = rollDice().first
    val secondRollAI = rollDice().second

    println("Ход ai: первый куб - $firstRollAI, второй - $secondRollAI")

    resultSumRoll(sumRoll(firstRollHuman, secondRollHuman), sumRoll(firstRollAI, secondRollAI))
}

fun rollDice(): Pair<Int, Int> {
    val firstRoll = (1..6).random()
    val secondRoll = (1..6).random()

    return Pair(firstRoll, secondRoll)
}

fun sumRoll (firstR: Int, secondR: Int) : Int{
    return firstR + secondR
}

fun resultSumRoll (sum1: Int, sum2: Int) {
    if (sum1 > sum2) println("Победило человечество")
    else if (sum2 > sum1) println("Победила машина")
    else println("Победил баланс сил.")
}
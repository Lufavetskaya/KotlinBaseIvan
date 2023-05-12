package lesson_10

fun main() {
    val firstRollHuman = rollDice()
    val secondRollHuman = rollDice()

    println("Ход человечества: первый куб - $firstRollHuman, второй - $secondRollHuman")

    val firstRollAI = rollDice()
    val secondRollAI = rollDice()

    println("Ход ai: первый куб - $firstRollAI, второй - $secondRollAI")

    resultSumRoll(sumRoll(firstRollHuman, secondRollHuman), sumRoll(firstRollAI, secondRollAI))
}

fun rollDice(): Int {
    return (1..6).random()
}

fun sumRoll (firstR: Int, secondR: Int) : Int{
    return firstR + secondR
}

fun resultSumRoll (sum1: Int, sum2: Int) {
    if (sum1 > sum2) println("Победило человечество")
    else if (sum2 > sum1) println("Победила машина")
    else println("Победил баланс сил.")
}
package lesson_6

fun main() {
    val randomWinNumber = (1..9).random()
    var numberForTry = 1

    println("Попробуй угадать число от 1 до 9 за 5 попыток!")

    while (numberForTry < 6) {
        println("Попытка ${numberForTry++}")
        val inputUser = readln().toInt()
        if (inputUser == randomWinNumber) {
            println("Это была великолепная игра!")
            break
        } else if (numberForTry == 6) println("Было загадано число $randomWinNumber")
        else println("Еще раз!")
    }
}
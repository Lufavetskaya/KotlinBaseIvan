package lesson_5

const val WIN_NUMBER_ONE = 25
const val WIN_NUMBER_TWO = 11

fun main() {
    println("Какие два числа из 100(включительно) сегодня принесут удачу?\nНапечатайте поочередно, на разных строках.")

    val userChoice1 = readln().toInt()
    val userChoice2 = readln().toInt()

    val resultChoice = if ((userChoice1 == WIN_NUMBER_ONE || userChoice2 == WIN_NUMBER_ONE) && (userChoice1 == WIN_NUMBER_TWO || userChoice2 == WIN_NUMBER_TWO)) "Поздравляем! Вы выиграли главный приз!"
    else if ((userChoice1 == WIN_NUMBER_ONE || userChoice2 == WIN_NUMBER_ONE) || (userChoice1 == WIN_NUMBER_TWO || userChoice2 == WIN_NUMBER_TWO)) "Вы выиграли утешительный приз!"
    else "Неудача! Крутите барабан!"

    println("Вы ввели $userChoice1 и $userChoice2!\n$resultChoice")
    println("Победные номера: $WIN_NUMBER_ONE, $WIN_NUMBER_TWO")
}
package lesson_5

fun main() {
    val winNumbersList = (1..100).toList()

    val winNumber1 = winNumbersList.random()
    val winNumber2 = winNumbersList.random()

    println("Какие два числа из 100(включительно) сегодня принесут удачу?\nНапечатайте поочередно, на разных строках.")

    val userChoice1 = readln().toInt()
    val userChoice2 = readln().toInt()

    val resultChoice = if ((userChoice1 == winNumber1 || userChoice2 == winNumber1) && (userChoice1 == winNumber2 || userChoice2 == winNumber2)) "Поздравляем! Вы выиграли главный приз!"
    else if ((userChoice1 == winNumber1 || userChoice2 == winNumber1) || (userChoice1 == winNumber2 || userChoice2 == winNumber2)) "Вы выиграли утешительный приз!"
    else "Неудача! Крутите барабан!"

    println("Вы ввели $userChoice1 и $userChoice2!\n$resultChoice")
    println("Победные номера: $winNumber1, $winNumber2")
}
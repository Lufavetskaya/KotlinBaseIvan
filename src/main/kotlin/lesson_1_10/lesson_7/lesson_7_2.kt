package lesson_1_10.lesson_7

fun main() {
    do {
        val symbolCode = (1000..9999).random()

        println("Ваш код авторизации: $symbolCode")
        println("Введите ваш код авторизации:")

        val inputUserCode = readln().toInt()

        if (inputUserCode == symbolCode) println("Успешно")
        else println("wrong.")
    } while (inputUserCode != symbolCode)
}
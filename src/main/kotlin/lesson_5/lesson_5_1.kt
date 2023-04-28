package lesson_5

fun main() {
    println("Для входа, убедитесь, что вы не бот.\n1 + 0 = ")

    val answerForLogin = readln().toInt()

    println(if(answerForLogin == 1) "Добро пожаловать!"
    else "Доступ запрещен.")
}
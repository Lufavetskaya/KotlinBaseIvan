package lesson_5

fun main() {
    println("Для входа, убедитесь, что вы не бот.\n1 + 0 = ")

    val answerForCheckHuman = 1
    val answerForLogin = readln().toInt()

    println(
        if(answerForLogin == answerForCheckHuman) "Добро пожаловать!"
        else "Доступ запрещен."
    )
}
package lesson_5

const val LOGIN_PERSON = "Batman"
const val PASSWORD_PERSON = "password"

fun main() {
    println("Введите логин.")

    val inputUserLogin = readln()

    if (inputUserLogin != LOGIN_PERSON) println("Пользователь не найден. Пройдите регистрацию.")
    else {
        println("Введите пароль.")

        val inputUserPass = readln()

        val resultInputPass = if (inputUserPass != PASSWORD_PERSON) "Ошибка содержания пароля. Отдохни."
        else "Велком, старый друг! Чаю?"

        println(resultInputPass)
    }

}
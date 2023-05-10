package lesson_6

fun main() {
    println("Регистрация.\nВведите логин:")

    val loginUser = readln()

    println("Введите пароль:")

    val passwordUser = readln()

    do {
        println("Авторизация.\nВведите логин")
        val inputLoginUser = readln()
        println("Введите пароль:")
        val inputPasswordUser = readln()
        if (inputLoginUser == loginUser && inputPasswordUser == passwordUser) println("Авторизация прошла успешно")
        else println("Неверные данные")
    } while (inputLoginUser != loginUser && inputPasswordUser != passwordUser)

}
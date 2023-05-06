package lesson_6

fun main() {
    println("Регистрация.\nВведите логин:")

    val loginUser = readln()

    println("Введите пароль:")

    val passwordUser = readln()

    do {
        println("Авторизация.\nВведите логин")
        val inputLoginUser = readln()
        println(
            if (inputLoginUser == loginUser) "Введите пароль:"
            else "Несуществующий логин"
        )
    } while (inputLoginUser != loginUser)

    do {
        val inputPasswordUser = readln()
        println(
            if (inputPasswordUser == passwordUser) "Авторизация прошла успешно"
            else "Неверный пароль"
        )
    } while (inputPasswordUser != passwordUser)
}
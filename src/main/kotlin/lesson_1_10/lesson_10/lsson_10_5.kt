package lesson_1_10.lesson_10

fun main() {
    println("Регистрация. Введите логин.")

    val userLogin = checkLoginLength()
    val passUser = makePassword()

    println("Ваш логи: $userLogin\nВаш пароль: $passUser")

    authoUser(userLogin, passUser)
}

fun checkLoginLength(): String {
    var userLogin = ""

    do {
        val inputUserLogin = readln()
        if (inputUserLogin.length < 4) println("Логин недостаточно длинный")
        else userLogin = inputUserLogin
    } while (inputUserLogin.length < 4)

    return userLogin
}

fun makePassword(): String {
    var password = ""
    val allSymbolsForPass = ('a'..'z') + ('A'..'Z') + (0..9)

    for (i in 1..7) {
        password += allSymbolsForPass.random()
    }
    return password
}

fun authoUser(userLogin: String, userPass: String) {
    println("Пройдите авторизацию.")
    do {
        val inputUserLogin = readln()
        val inputUserPass = readln()
        if (inputUserLogin != userLogin || inputUserPass != userPass) println("Неверные данные")
        else {
            println("Все верно. Пройдите проверку смс кода.")
            checkCode()
        }

    } while (inputUserLogin != userLogin || inputUserPass != userPass)
}

fun randomCode(): String {
    return (1000..9999).random().toString()
}

fun checkCode() {
    do {
        val codeForCheck = randomCode()
        println("Ваш код проверки: $codeForCheck")
        println("Введите 4 значный код из смс.")
        val userCode = readln()
        if (userCode == codeForCheck) println("Все изящно и хорошо! Вошли.")
        else println("Неверрррный код. Попробуй еще")
    } while (userCode != codeForCheck)
}

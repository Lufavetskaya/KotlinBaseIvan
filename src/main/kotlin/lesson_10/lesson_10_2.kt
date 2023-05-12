package lesson_10

fun main() {
    println("придумйате логин")
    val userLogin = readln()

    println("придумайте пароль")
    val userPass = readln()

    checkLoginAnfPass(userLogin, userPass)
}

fun checkLoginAnfPass(login: String, pass: String) {
    if (login.length < 4 || pass.length < 4) {
        println("Логин или пароль недостаточно длинные")
    } else println("Welcome, honey!")
}
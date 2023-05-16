package lesson_10

fun main() {
    println("придумйате логин")
    val userLogin = readln()

    println("придумайте пароль")
    val userPass = readln()

    printMessForUser(checkLoginAndPass(userLogin, userPass))
}

fun checkLoginAndPass(login: String, pass: String): Boolean{
    return  (login.length < 4 || pass.length < 4)

}

fun printMessForUser(checkPass: Boolean) {
    if (checkPass) println("Логин или пароль недостаточно длинные")
    else println("Welcome, honey!")
}
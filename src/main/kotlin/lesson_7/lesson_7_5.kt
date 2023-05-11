package lesson_7

fun main() {
    println("Укажите длину пароля")
    val lengthPassUser = readln().toInt()
    var password = ""

    val allSymbolsForPass = ('a'..'z') + ('A'..'Z') + (0..9)

    for (i in 1..lengthPassUser) {
        password += allSymbolsForPass.random()
    }

    println(password)
}

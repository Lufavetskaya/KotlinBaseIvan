package lesson_7

fun main() {
    println("Укажите длину пароля")
    val lengthPassUser = readln().toInt()
    var password = ""
    var allSymbolsForPass = ""

    val randomNum = 0..9
    for (i in randomNum) allSymbolsForPass += i

    val randomLetterSmall = 'a'..'z'
    for (i in randomLetterSmall) allSymbolsForPass += i

    val randomLetterBig = 'A'..'Z'
    for (i in randomLetterBig) allSymbolsForPass += i

    for (i in 1..lengthPassUser) {
        password += allSymbolsForPass.random()
    }

    println(password)
}

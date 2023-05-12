package lesson_10

fun main() {
    println("Укажите длину пароля")
    val lengthPassUser = readln().toInt()
    println("Ваш пароль: ${createPass(lengthPassUser)}")
}

fun createPass(length: Int): String {
    var password = ""
    val allSymbolsForPass = ('!'..'/') + ' '
    val allNumberFoPass = (0..9)
    for (i in 1..length) {
        if (i % 2 == 0) password += allNumberFoPass.random()
        else password += allSymbolsForPass.random()
    }
    return password
}
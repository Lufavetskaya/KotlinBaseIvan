package lesson_7

fun main() {
    println("Укажите длину пароля")
    val lengthPassUser = readln().toInt()
    var password = ""

    for (i in 1..lengthPassUser) {
        val randomNum = (0..9).random().toString()
        val randomLetterSmall = ('a'..'z').random().toString()
        val randomLetterBig = ('A'..'Z').random().toString()
        when ((1..3).random()) {
            1 -> password += randomLetterBig
            2 -> password += randomNum
            3 -> password += randomLetterSmall
        }
    }

    println(password)
}
package lesson_5

const val AGE_FOR_LOGIN = 18
const val NOW_YEAR = 2023

fun main() {
    println("Год твоего рождения?")

    val yearOfBirthUser = readln().toInt()

    println(
        if ((NOW_YEAR - yearOfBirthUser) >= AGE_FOR_LOGIN) "Показать экран со скрытым контентом"
        else "Надо еще кушать, спать и подрастать."
    )
}
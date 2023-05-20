package lesson_11

fun main(){

    val firstUser = UserTask2(
        id = 1,
        login = "Lufa",
        password = "zxcvb",
        email = "lufa@gmail.com"
    )

    println("Действия юзера.")
    firstUser.fillingBioUser()
    firstUser.changePassUser()
    firstUser.printInfoUser()
    firstUser.sendMessUser()

}

class UserTask2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun printInfoUser() {
        print("$id, $login, $password, $email")
        if (bio.isNotEmpty()) println(", $bio")
    }

    fun fillingBioUser() {
        println("Введите свою биографию:")
        bio = readln()
    }

    fun changePassUser() {
        println("Введите старый пароль")
        if (readln() == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль измене!")
        } else println("Ошибка исходного пароля")
    }

    fun sendMessUser() {
        println("Что вы хотите отправить?")
        println("$login, ${readln()}")
    }

}
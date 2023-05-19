package lesson_11_5

class User() {

    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
    var bio: String = ""


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
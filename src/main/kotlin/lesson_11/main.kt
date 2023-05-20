package lesson_11

fun main() {

    val forum = Forum()

    val newUser0 = forum.newUser()
    newUser0.id = 4
    newUser0.login = "Gocha"

    val newUser1 = forum.newUser()
    newUser1.id = 5
    newUser1.login = "Krosh"

    forum.newMessage(newUser0.id, newUser0.login)
    forum.newMessage(newUser0.id, newUser0.login)
    forum.newMessage(newUser1.id, newUser1.login)

    forum.printThread(forum.allMess)
    newUser0.fillingBioUser()

}

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

class Forum() {
    val allMess = mutableListOf<String>()

    fun newUser(): User {
        return User()
    }

    fun newMessage(authorId: Int, author: String) {
        println("введите сообщение")
        val userMes = "$authorId $author: ${readln()}"
        println(userMes)
        saveAllMess(userMes)
    }

    fun saveAllMess(messenge: String) {
        allMess.add(messenge)
    }

    fun printThread(allMess: MutableList<String>) {
        allMess.forEach { println(it) }
    }

}
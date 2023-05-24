package lesson_11

fun main() {

    val forum = Forum()

    val newUser1 = forum.newUser("Krosh")
    val newUser2 = forum.newUser("Gocha")

    forum.newMessage(newUser1.uniqueID, newUser1.login, "буб")
    forum.newMessage(newUser2.uniqueID, newUser2.login, "буб2")
    forum.newMessage(newUser2.uniqueID, newUser2.login, "буб3")

    forum.printThread(forum.allMessages)

}

class User( val uniqueID: Int,  val login: String) {
    val email: String = ""
    val password: String = ""
    val bio: String = ""


    fun printInfoUser() {
        print("$uniqueID, $login, $password, $email")
        if (bio.isNotEmpty()) println(", $bio")
    }

    fun sendMessUser() {
        println("Что вы хотите отправить?")
        println("$login, ${readln()}")
    }
}

class Forum() {
    var uniqueID = 1
    val allMessages = mutableListOf<String>()

    fun newUser(login: String): User{
        val newUser = User(uniqueID ,login)
        uniqueID++
        return newUser
    }

    fun newMessage(authorId: Int, author: String, message: String) {
        val userMes = "$authorId $author: $message"
        println(userMes)
        println()
        saveAllMessage(userMes)
    }

    fun saveAllMessage(message: String) {
        allMessages.add(message)
    }

    fun printThread(allMessages: MutableList<String>) {
        allMessages.forEach { println(it) }
    }

}
package lesson_11_5

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
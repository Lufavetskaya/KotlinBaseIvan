package lesson_15

fun main() {
    val newUser = User("Krosh", "User")
    newUser.printMessage()
    newUser.readForum()
    println()

    val newAdmin = AdminForum("Bro", "Admin")
    newAdmin.readForum()
    newAdmin.deleteMessage()
    newAdmin.deleteUser()
    newAdmin.printMessage()

}

abstract class BaseEntityForum {
    abstract val nameUser: String
    abstract val typeUser: String

    fun readForum() {
        println("Чтение форума $nameUser")
    }

    fun printMessage() {
        println("Написано сообщение $nameUser $typeUser")
    }
}

class User(override val nameUser: String, override val typeUser: String) : BaseEntityForum()

class AdminForum(override val nameUser: String, override val typeUser: String) : BaseEntityForum() {

    fun deleteUser() {
        println("Удален пользователь, нарушающий правила сообщества")
    }

    fun deleteMessage() {
        println("Удалено сообщение, нарушающее правила сообщества")
    }

}
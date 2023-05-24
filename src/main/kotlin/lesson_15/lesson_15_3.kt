package lesson_15

fun main() {
    val newUser = User("Krosh", "User")
    newUser.printMessage(newUser.nameUser, newUser.typeUser)
    newUser.readForum(newUser.nameUser)
    println()

    val newAdmin = AdminForum("Bro", "Admin")
    newAdmin.readForum(newAdmin.nameUser)
    newAdmin.deleteMessage()
    newAdmin.deleteUser()
    newAdmin.printMessage(newAdmin.nameUser, newAdmin.typeUser)

}

abstract class BaseEntityForum() {
    abstract val nameUser: String
    abstract val typeUser: String

    fun readForum(nameUser: String) {
        println("Чтение форума $nameUser")
    }

    fun printMessage(nameUser: String, typeUser: String){
        println("Написано сообщение $nameUser $typeUser")
    }
}

class User(override val nameUser: String, override val typeUser: String) : BaseEntityForum() {
}

class AdminForum(override val nameUser: String, override val typeUser: String) : BaseEntityForum() {

    fun deleteUser() {
        println("Удален пользоватлеь, нарушающий правила сообщества")
    }

    fun deleteMessage() {
        println("Удалено сообщение, нарушающее правила сообщества")
    }

}
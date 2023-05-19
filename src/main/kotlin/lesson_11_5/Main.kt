package lesson_11_5

fun main() {

    val forum = Forum()

    val newUser0 = forum.newUser(4, "Gocha", "pass1", "gocha@mail.com", "")

    val newUser1 = forum.newUser(1, "Krosh", "pass2", "krosh@mail.com", "")

    //println(newUser0.email) help

    forum.newMessage(newUser0.id, newUser0.login)
    forum.newMessage(newUser0.id, newUser0.login)
    forum.newMessage(newUser1.id, newUser1.login)

    forum.printThread(forum.allMess)
    newUser0.fillingBioUser()

}
package lesson_11_5

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
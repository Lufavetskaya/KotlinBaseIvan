package lesson_11

fun main(){

    val firstUser = User(
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
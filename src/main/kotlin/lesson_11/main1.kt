package lesson_11

fun main() {
    val firstUser: User1 = User1(
        id = 1,
        login = "007",
        password = "qwert",
        email = "007@yahoo.com",
    )

    val secondUser: User1 = User1(
        id = 2,
        login = "006",
        password = "asdfg",
        email = "006@gmail.com"
    )

    println("${firstUser.id}, ${firstUser.login}, ${firstUser.password}, ${firstUser.email}")
    println("${secondUser.id}, ${secondUser.login}, ${secondUser.password}, ${secondUser.email}")

}

class User1(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

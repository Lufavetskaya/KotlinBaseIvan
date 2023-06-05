package lesson_17

fun main() {
    val firstUser = User("Krosh", "123456")

    println("Логин: ${firstUser.loginUser}\nПароль: ${firstUser.passwordUser}")

    firstUser.loginUser = "KroshGavrosh"
    firstUser.passwordUser = "0123"

    println("Логин: ${firstUser.loginUser}\nПароль: ${firstUser.passwordUser}")

}

class User(
    private val initLoginUser: String,
    private val initPasswordUser: String,
) {
    var loginUser: String = initLoginUser
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var passwordUser: String = initPasswordUser
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            var secretPassword: String = ""
            repeat(field.length) {
                secretPassword += "*"
            }
            return secretPassword
        }

}
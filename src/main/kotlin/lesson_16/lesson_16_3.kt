package lesson_16

fun main(){
    val newUser = User("Krosh", "1234")
    newUser.checkPass()

}

class User(val login: String, private var password: String){
    fun checkPass(){
        println("Проверяем, помните ли вы свой пароль. Введите пароль.")
        if (readln() == password) println("Все хорошо, вы помните свой пароль")
        else println("Вы ввели неверный пароль")
    }
}
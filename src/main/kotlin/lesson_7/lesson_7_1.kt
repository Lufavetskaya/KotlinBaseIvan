package lesson_7

fun main() {
    val symbolPass1 = ('a'..'z').random()
    val symbolPass2 = (1..9).random()
    val symbolPass3 = ('a'..'z').random()
    val symbolPass4 = (1..9).random()
    val symbolPass5 = ('a'..'z').random()
    val symbolPass6 = (1..9).random()

    println("Ваш пароль: $symbolPass1$symbolPass2$symbolPass3$symbolPass4$symbolPass5$symbolPass6")
}
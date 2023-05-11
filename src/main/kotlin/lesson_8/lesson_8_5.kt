package lesson_8

fun main() {
    println("Сколько ингредиентов в вашем рецепте?")
    val userTotalIngredients = readln().toInt()

    println("Введите $userTotalIngredients ингредиентов, каждый на новой строке.")
    val arrayIngredients = Array(userTotalIngredients) { readln() }

    println("Список для вашего рецепта:")
    arrayIngredients.forEach { println(it) }
}
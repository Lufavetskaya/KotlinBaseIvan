package lesson_8

fun main() {
    println("Сколько ингредиентов в вашем рецепте?")

    val userTotalIngredients = readln().toInt()
    val arrayIngredients = Array(userTotalIngredients) { "" }

    println("Введите $userTotalIngredients ингредиентов, каждый на новой строке.")

    for (i in arrayIngredients.indices) {
        val inputUserIngr = readln()
        arrayIngredients[i] = inputUserIngr
    }

    println("Список для вашего рецепта:")
    arrayIngredients.forEach { println(it) }
}
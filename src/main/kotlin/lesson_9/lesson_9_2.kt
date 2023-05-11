package lesson_9

fun main() {
    val baseProduct = mutableListOf("рис", "яйцо", "нори")

    println("В рецепте есть базовые ингредиенты:")
    baseProduct.forEach {
        println(it)
    }

    println("Желаете добавить еще?")
    val answerUserForProductAdd = readln()
    val goodAnswerForAdd = "да"

    if (answerUserForProductAdd != goodAnswerForAdd) return
    else {
        println("Какой ингредиент вы хотите добавить?")
        val userAddProduct = readln()
        baseProduct.add(userAddProduct)
    }

    println("Теперь в рецепте есть следующие ингредиенты:")
    baseProduct.forEach {
        println(it)
    }

}
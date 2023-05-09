package lesson_8

fun main() {
    val ingredientsForCheesecake =
        arrayOf(
            "творожный сыр",
            "яйца",
            "сахарная пудра",
            "мука пшеничная",
            "сок лимона",
            "жирные сливки",
            "хорошее настроение"
        )

    println("Какой ингредиент нужно проверить на наличие?")
    val ingredientsUser = readln()
    val badAnswerIndexOf = -1

    if (ingredientsForCheesecake.indexOf(ingredientsUser) == badAnswerIndexOf) println("Такого ингредиента в рецепте нет")
    else if (ingredientsUser == ingredientsForCheesecake[ingredientsForCheesecake.indexOf(ingredientsUser)]) {
        println("Ингредиент $ingredientsUser в рецепте есть")
    }
}
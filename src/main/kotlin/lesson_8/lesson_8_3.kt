package lesson_8

fun main() {
    val ingredientsCake =
        arrayOf(
            "творожный сыр",
            "яйца",
            "сахарная пудра",
            "мука пшеничная",
            "сок лимона",
            "жирные сливки",
            "хорошее настроение",
        )

    println("Какой ингредиент нужно проверить на наличие?")
    val ingredientsUser = readln()
    val badAnswerIndexOf = -1
    val searchIndexForIngUser = ingredientsCake.indexOf(ingredientsUser)

    if (searchIndexForIngUser == badAnswerIndexOf) {
        println("Такого ингредиента в рецепте нет")
    } else if (ingredientsUser == ingredientsCake[searchIndexForIngUser]) {
        println("Ингредиент $ingredientsUser в рецепте есть")
    }
}
package lesson_8

fun main() {
    val ingredientsForCheesecake =
        arrayOf("творожный сыр", "яйца", "сахарная пудра", "мука пшеничная", "сок лимона", "жирные сливки")

    println("Какой ингредиент нужно проверить на наличие?")
    val ingredientsUser = readln()

    for (i in ingredientsForCheesecake.indices) {
        if (ingredientsUser == ingredientsForCheesecake[i]) {
            println("Ингредиент $ingredientsUser в рецепте есть")
            break
        } else if ((i == ingredientsForCheesecake.lastIndex) && (ingredientsUser != ingredientsForCheesecake[i])) println(
            "Такого ингредиента в рецепте нет"
        )
    }
}
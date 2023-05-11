package lesson_9

fun main() {
    val recipeRatatouille = listOf(
        "баклажан",
        "кабачок",
        "грибы",
        "помидор",
        "картофель(молодой)",
        "сыр",
        "оливковое масло",
        "бальзамический уксус"
    )

    println("В рецепте есть следующие ингредиенты:")
    recipeRatatouille.forEach { product: String ->
        println(product)
    }

}
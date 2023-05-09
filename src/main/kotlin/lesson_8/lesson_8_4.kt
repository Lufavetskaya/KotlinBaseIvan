package lesson_8

fun main() {
    val ingredientsForChickenPie =
        arrayOf("чеснок", "лук", "куриный фарш", "мягкий творог", "яйца", "твердый сыр", "соль", "зеленый лук")

    print("Для пирога надо: ")
    ingredientsForChickenPie.forEach { println(it) }

    println("Что заменяем?")

    val userChangeIngr = readln()
    val userWantIngr: String

    for (i in ingredientsForChickenPie.indices) {
        if (userChangeIngr == ingredientsForChickenPie[i]) {
            println("А на что заменим?")
            userWantIngr = readln()
            ingredientsForChickenPie[i] = userWantIngr
            print("Готово! Вы сохранили следующий список: ")
            ingredientsForChickenPie.forEach { println(it) }
            break
        } else if (i == ingredientsForChickenPie.lastIndex) println("Такого ингредиента нет в списке")
    }


}
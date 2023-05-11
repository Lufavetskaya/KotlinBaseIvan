package lesson_8

fun main() {
    val ingredientsForChickenPie =
        arrayOf("чеснок", "лук", "куриный фарш", "мягкий творог", "яйца", "твердый сыр", "соль", "зеленый лук")

    print("Для пирога надо: ")
    ingredientsForChickenPie.forEach { println(it) }

    println("Что заменяем?")

    val userChangeIngr = readln()
    val userWantIngr: String
    val notOnList = -1

    if (notOnList == ingredientsForChickenPie.indexOf(userChangeIngr)) {
        println("Такого ингредиента нет в списке")
    } else if (userChangeIngr == ingredientsForChickenPie[ingredientsForChickenPie.indexOf(userChangeIngr)]) {
        println("А на что заменим?")
        userWantIngr = readln()
        ingredientsForChickenPie[ingredientsForChickenPie.indexOf(userChangeIngr)] = userWantIngr
        print("Готово! Вы сохранили следующий список: ")
        ingredientsForChickenPie.forEach { println(it) }
    }
}
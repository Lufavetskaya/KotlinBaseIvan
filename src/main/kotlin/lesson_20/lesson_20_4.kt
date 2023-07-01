package lesson_20

fun main() {

    val foodInFridgeList = listOf<String>("зеленый лучок", "яички", "шампиньоны", "сливочное масло", "счастье")

    val lambdaForFridge = foodInFridgeList.map { food -> { println("Нажат элемент $food") } }

    for (food in foodInFridgeList.indices) {
        if (food % 2 == 0) {
            lambdaForFridge[food]()
        }
    }
}

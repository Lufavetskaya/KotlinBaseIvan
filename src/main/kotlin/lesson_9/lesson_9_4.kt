package lesson_9

fun main() {
    println("Введите 5 продуктов через запятую")

    val productList = readln().split(", ").toMutableList().sorted()

    productList.forEach {
        println(it)
    }
}
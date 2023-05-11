package lesson_9

fun main() {
    println("Введите 5 продуктов через запятую")

    val productList = readln().split(", ").toMutableList()
    productList.sort()

    productList.forEach {
        println(it)
    }
}
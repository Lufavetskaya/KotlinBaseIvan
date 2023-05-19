package lesson_9

fun main() {
    println("Введите 5 продуктов.")
    val productSet = MutableList(5) { readln() }.toSet().sorted()

    for (i in productSet) {
        when {
            (i == productSet.first()) -> {
                print("${i.replaceFirstChar { it.uppercase() }}, ")
            }

            (i == productSet.last()) -> {
                print("${i.replaceFirstChar { it.lowercase() }}.")
            }

            else -> print("${i.replaceFirstChar { it.lowercase() }}, ")

        }
    }
}

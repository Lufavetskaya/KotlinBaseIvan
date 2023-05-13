package lesson_9

fun main() {
    val productSet = MutableList(5) { readln() }.toSet().sorted()
    var countForPrint = 1

    for (i in productSet) {
        if (countForPrint == 1) {
            print("${i.replaceFirstChar { it.uppercase() }}, ")
            countForPrint++
        } else if (countForPrint == productSet.size) {
            i.lowercase()
            print("${i.replaceFirstChar { it.lowercase() }}.")
            countForPrint++
        } else {
            i.lowercase()
            print("${i.replaceFirstChar { it.lowercase() }}, ")
            countForPrint++
        }
    }
}

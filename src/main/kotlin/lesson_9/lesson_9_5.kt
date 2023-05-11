package lesson_9

fun main() {
    val productSet = MutableList(5) { readln() }
    val uniqueProduct = mutableSetOf<String>()
    productSet.sort()
    uniqueProduct.addAll(productSet)
    var countForPrint = 1

    for (i in uniqueProduct) {
        if (countForPrint == 0) {
            print("${i.uppercase()},")
            countForPrint++
        } else if (countForPrint == uniqueProduct.size) {
            i.lowercase()
            print("$i.")
            countForPrint++
        } else {
            i.lowercase()
            print("$i, ")
            countForPrint++
        }
    }
}

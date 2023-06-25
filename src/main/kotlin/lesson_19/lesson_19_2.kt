package lesson_19

fun main() {
    val firstItem = Item("штанцы", 1, Category.CLOTH)
    val secondItem = Item("банка колы", 2, Category.OTHER)

    firstItem.printInfoItem()
    println()
    secondItem.printInfoItem()
}

enum class Category {
    CLOTH,
    STATIONERY,
    OTHER,
}

class Item(
    private val nameItem: String,
    private val idItem: Int,
    private val category: Category,
) {
    fun printInfoItem() {
        println("Товар: $nameItem\nАртикул: $idItem\n${getCategory(category)}")
    }

}

fun getCategory(category: Category): String {
    return when (category) {
        Category.CLOTH -> "Категория: одежда"
        Category.STATIONERY -> "Категория: канцелярские товары"
        Category.OTHER -> "Категория: разное"
    }
}
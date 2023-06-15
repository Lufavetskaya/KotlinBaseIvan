package lesson_19

fun main() {
    val firstItem = Item("штанцы", 1, Category.CLOTH)
    val secondItem = Item( "банка колы", 2, Category.OTHER)

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
        println("Товар: $nameItem\nАртикул: $idItem")
        getCategory(category)
    }

}

fun getCategory(category: Category) {
    when (category) {
        Category.CLOTH -> println("Категория: одежда")
        Category.STATIONERY -> println("Категория: канцелярские товары")
        Category.OTHER -> println("Категория: разное")
    }
}
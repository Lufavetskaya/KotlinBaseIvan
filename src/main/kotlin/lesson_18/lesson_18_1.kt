package lesson_18


fun main() {
    val firstOrder: Order = SmallOrder(1, "tea")
    val secondOrder: Order = BigOrder(2, listOf("tea", "milk", "potato"))

    val arrayOrders = arrayOf(firstOrder, secondOrder)

    fun printInfoAllOrders(arrayOrders: Array<Order>) {
        arrayOrders.forEach { it.infoOrder() }
    }

    printInfoAllOrders(arrayOrders)
}

abstract class Order() {
    abstract fun infoOrder()
}

class SmallOrder(
    private val numberOrder: Int,
    private val contentOrder: String,
) : Order() {
    override fun infoOrder() {
        println("Номер заказа: $numberOrder\nЗаказан товар: $contentOrder")
    }
}

class BigOrder(
    private val numberOrder: Int,
    private val contentOrder: List<String>,
) : Order() {
    override fun infoOrder() {
        print("Номер заказа: $numberOrder\nЗаказаны следующие товары: ")
        print(contentOrder.joinToString ( ", " ))
    }
}


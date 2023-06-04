package lesson_16

fun main() {
    val firstOrder = Order(1, "open")
    firstOrder.callManager("shipping")

}

class Order(private val numberOrder: Int, private var statusOrder: String) {

    fun callManager(status: String) {
        println("Обращение к менеджеру для замены статуса заказа")
        changeStatusOrder(status)
    }

    private fun changeStatusOrder(status: String) {
        println("Замена статуса")
        statusOrder = status
        println(statusOrder)
    }
}
package lesson_14

fun main() {

    val sShip = standardShip("Королева Мэри 2", 56, 151_400)

    sShip.getShipSpeedInfo()
    sShip.getCapacityShipInfo()

}

class standardShip(val nameShip: String, val speedShip: Int, val loadCapacityShip: Int) {
    fun getShipSpeedInfo() {
        println("Скорость коробля $nameShip: $speedShip км/ч")
    }

    fun getCapacityShipInfo() {
        println("Грузоподъемность коробля $nameShip: $loadCapacityShip брт")
    }
}
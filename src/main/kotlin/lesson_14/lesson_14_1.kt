package lesson_14

fun main() {

    val sShip = standardShip("Королева Мэри 2", 56, 151_400)

    sShip.infoSpeedShip()
    sShip.infoCapacityShip()

}

class standardShip(val nameShip: String, val speedShip: Int, val loadCapacityShip: Int) {
    fun infoSpeedShip() {
        println("Скорость коробля $nameShip: $speedShip км/ч")
    }

    fun infoCapacityShip() {
        println("Грузоподъемность коробля $nameShip: $loadCapacityShip брт")
    }
}
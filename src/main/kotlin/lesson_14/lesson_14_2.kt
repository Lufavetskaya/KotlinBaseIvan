package lesson_14


fun main() {

    val sShip = StandardShip2("Королева Мэри 2", 56, 151_400)
    val iShip = IcebreakerShip2("Воображаемый", 29, 100_000)
    val cShip = CargoShip2("MSC Gulsun", 29, 197_500, 23_756)

    sShip.infoSpeedShip()
    sShip.infoCapacityShip()
    println()
    iShip.infoSpeedShip()
    iShip.infoCapacityShip()
    iShip.operateInIce()
    println()
    cShip.infoSpeedShip()
    cShip.infoCapacityShip()
    cShip.infoGRT()

}

open class StandardShip2(val nameShip: String, val speedShip: Int, val loadCapacityShip: Int) {
    fun infoSpeedShip() {
        println("Скорость коробля $nameShip: $speedShip км/ч")
    }

    fun infoCapacityShip() {
        println("Грузоподъемность коробля $nameShip: $loadCapacityShip брт")
    }
}

class IcebreakerShip2(
    nameShip: String,
    speedShip: Int,
    loadCapacityShip: Int,
    val icebreaker: Boolean = true,
) : StandardShip2(nameShip, speedShip, loadCapacityShip) {

    fun operateInIce() {
        println("$nameShip прокладывает дорогу во льду")
    }


}

class CargoShip2(
    nameShip: String,
    speedShip: Int,
    loadCapacityShip: Int,
    val grt: Int,
) : StandardShip2(nameShip, speedShip, loadCapacityShip) {

    fun infoGRT() {
        println("Регистровый тоннаж $nameShip: $grt TEU")
    }

}
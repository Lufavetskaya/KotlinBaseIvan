package lesson_17

fun main(){
    val firstShip = Ship("Мантикор", 10.0, "Домик")
    firstShip.shipName = "Мантич"
    println("${firstShip.shipName} ${firstShip.speedMedium} ${firstShip.homePort}")

}

class Ship(
    private val initShipName: String,
    val speedMedium: Double,
    val homePort: String,
){
    var shipName: String = initShipName
        set(value) {
            if (field != value) {
                println("Ошибка: Имя корабля нельзя изменить.")
            }
        }
}
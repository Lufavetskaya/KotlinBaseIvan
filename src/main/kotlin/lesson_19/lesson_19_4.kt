package lesson_19

fun main() {
    val firstTank = Tank("буб1", Patron.BLUE)

    firstTank.short()
    firstTank.takePatron()
    firstTank.short()
    firstTank.takePatron()
    firstTank.short()
    firstTank.takePatron()
    firstTank.short()

}

class Tank(
    val name: String,
    var patron: Patron,
) {
    fun takePatron() {
        patron = Patron.values().random()
        println("Ответвенный за патроны хватает рандомный и это - ${patron.name}")
    }

    fun short() {
        println("бам быдыщ  на  ${patron.damage}")
    }
}

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

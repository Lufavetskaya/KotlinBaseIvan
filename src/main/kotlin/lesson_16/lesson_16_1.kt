package lesson_16

fun main() {
    val firstRoll = Dice()
    firstRoll.getRoll()
}

class Dice(
    private val rollDice: Int = ((1..6).random())
) {
    fun getRoll() {
        println(rollDice)
    }
}
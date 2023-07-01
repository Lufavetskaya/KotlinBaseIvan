package lesson_18

fun main() {
    val firstDice = OriginDice()
    val secondDice = FourFaceDice()
    val thirdDice = EightFaceDice()

    val allDiceArray = arrayOf(firstDice, secondDice, thirdDice)

    fun allDiceRoll(array: Array<Dice>) {
        array.forEach { it.rollDice() }
    }

    allDiceRoll(allDiceArray)
}

abstract class Dice {
    abstract fun rollDice()
}

class OriginDice : Dice() {
    override fun rollDice() {
        println("Шестигранный кубик выбрасывает: ${(1..6).random()}")
    }
}

class FourFaceDice : Dice() {
    override fun rollDice() {
        println("Четырехгранный кубик выбрасывает: ${(1..4).random()}")
    }
}

class EightFaceDice : Dice() {
    override fun rollDice() {
        println("Восьмигранный кубик выбрасывает: ${(1..8).random()}")
    }
}
package lesson_1_10.lesson_3

fun main() {
    val moveChess = "D2-D4;0"
    val removeChar = "-"
    val removeChar2 = ";"

    val parsingMoveList = moveChess.split(removeChar, removeChar2)

    val startingPosition = parsingMoveList[0]
    val finishingPosition = parsingMoveList[1]
    val moveNumber = parsingMoveList[2]

    println(startingPosition)
    println(finishingPosition)
    println(moveNumber)
}
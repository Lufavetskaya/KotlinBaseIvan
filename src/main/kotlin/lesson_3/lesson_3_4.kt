package lesson_3

fun main() {
    var startingPosition = "E2"
    var finishingPosition = "E4"
    var moveNumber = 4

    println(String.format("%s-%s;%d", startingPosition, finishingPosition, moveNumber))

    startingPosition = "D2"
    finishingPosition = "D3"
    moveNumber = 5

    println(String.format("%s-%s;%d", startingPosition, finishingPosition, moveNumber))
}
package lesson_1_10.lesson_1

fun main(){
    val allSecondsSpace = 6_480
    val minutes = allSecondsSpace / 60 //108
    val restOfSeconds = allSecondsSpace % 60 //0

    println(String.format("%d:%02d", minutes, restOfSeconds))
}
package lesson_1

fun main(){
    val allSecondsSpace = 6_480
    val minutes = allSecondsSpace / 60 //108
    val restOfSeconds = allSecondsSpace % 60 //0

    println("$minutes:0$restOfSeconds")
}
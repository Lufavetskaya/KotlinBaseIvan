package lesson_7

fun main() {
    println("Введите последнее часло диапозона для ваших четных чисел:")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2){
        println(i)
    }
}
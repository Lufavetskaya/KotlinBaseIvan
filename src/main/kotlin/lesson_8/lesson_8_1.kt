package lesson_8

fun main() {
    val arrayWatchAD = Array(7) { 0 }

    for (i in arrayWatchAD.indices) {
        val forRandomArray = (1..15).random()
        arrayWatchAD[i] = forRandomArray
    }

    var sumWatchADWeek = 0

    for (i in arrayWatchAD.indices) {
        sumWatchADWeek += arrayWatchAD[i]
    }

    println(sumWatchADWeek)

    //println("${arrayWatchAD.sum()}")
}
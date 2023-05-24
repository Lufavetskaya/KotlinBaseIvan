package lesson_12

import kotlin.random.Random

fun main() {

    val listWeather = mutableListOf<KeepWeather5>()

    for (i in 1..10) {
        val dayWeather = KeepWeather5(
            temperatureDay = (-20..30).random(),
            temperatureNight = (-20..30).random(),
            rain = Random.nextBoolean(),
            atmosphericPressure = (660..680).random()
        )
        listWeather.add(dayWeather)
    }
    var rainDay = 0

    for (day in listWeather) {
        if (day.rain) rainDay++
    }

    val averageTDay = listWeather.map { it.temperatureDay }.average()
    val averageTNight = listWeather.map { it.temperatureNight }.average()
    val averagePressure = listWeather.map { it.atmosphericPressure }.average()

    println("Дождик шел: ${rainDay} дней\nДнем было в среднем: $averageTDay\nНочью было в среднем: $averageTNight\nДавление среднее за деньки: $averagePressure")
}

class KeepWeather5(
    var temperatureDay: Int,
    var temperatureNight: Int,
    var rain: Boolean = false,
    var atmosphericPressure: Int,
) {

    init {
        printWeather()
    }

    fun printWeather() {
        println(
            """Температура днем: $temperatureDay
               |Температура ночь: $temperatureNight
               |Налчиие дождя: $rain
               |Атмосферное давление: $atmosphericPressure
           """.trimMargin()
        )
    }
}
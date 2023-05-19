package lesson_12_5

import kotlin.random.Random

fun main() {
    var averageTDay = 0
    var averageTNight = 0
    var rainDay = 0
    var averagePressure = 0

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

    for (day in listWeather) {
        if (day.rain) rainDay++
        averageTDay += day.temperatureDay
        averageTNight += day.temperatureNight
        averagePressure += day.atmosphericPressure
    }

    println("Дождик шел: ${rainDay} дней\nДнем было в среднем: ${averageTDay / listWeather.size}С\nНочью было в среднем: ${averageTNight / listWeather.size}С\nДавление среднее за деньки: ${averagePressure / listWeather.size}")
}
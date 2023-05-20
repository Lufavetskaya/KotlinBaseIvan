package lesson_12

fun main() {
    val sixthDayLife = KeepWeatherTask3(1, 10, atmosphericPressure = 660)

    sixthDayLife.printWeather()
}

class KeepWeatherTask3(
    var temperatureDay: Int,
    var temperatureNight: Int,
    var rain: Boolean = false,
    var atmosphericPressure: Int
) {

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
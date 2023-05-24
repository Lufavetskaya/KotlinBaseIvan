package lesson_12

fun main() {
    val firstDayLife = KeepWeatherState()
    firstDayLife.temperatureDay = 16
    firstDayLife.temperatureNight = 10
    firstDayLife.rain = false
    firstDayLife.atmosphericPressure = 650

    val secondDayLife = KeepWeatherState()
    secondDayLife.temperatureDay = 25
    secondDayLife.temperatureNight = 16
    secondDayLife.rain = true
    secondDayLife.atmosphericPressure = 680

    firstDayLife.printWeather()
    secondDayLife.printWeather()


}

class KeepWeatherState{

    var temperatureDay: Int = 0
    var temperatureNight: Int = 0
    var rain: Boolean = false
    var atmosphericPressure: Int = 0

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
package lesson_12

fun main() {
    val thirdDayLife = KeepWeatherTask2(12, 10, true, 660)
    val fourthDayLife = KeepWeatherTask2(0, -50, false, 550)
    val fifthDayLife = KeepWeatherTask2(0, 50, true, 550)

    thirdDayLife.printWeather()
    fourthDayLife.printWeather()
    fifthDayLife.printWeather()
}

class KeepWeatherTask2(_temperatureDay: Int, _temperatureNight: Int, _rain: Boolean, _atmosphericPressure: Int) {

    val temperatureDay = _temperatureDay
    val temperatureNight = _temperatureNight
    val rain = _rain
    val atmosphericPressure = _atmosphericPressure

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
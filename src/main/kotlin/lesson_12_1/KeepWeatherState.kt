package lesson_12_1

class KeepWeatherState() {

    var temperatureDay: Int = 0
    var temperatureNight: Int = 0
    var rain: Boolean = false
    var atmosphericPressure: Int = 0

    fun printWeather(){
        println("""Температура днем: $temperatureDay
            |Температура ночь: $temperatureNight
            |Налчиие дождя: $rain
            |Атмосферное давление: $atmosphericPressure
        """.trimMargin())
    }
}
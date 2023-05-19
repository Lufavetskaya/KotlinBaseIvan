package lesson_12_5

class KeepWeather5(
    var temperatureDay: Int,
    var temperatureNight: Int,
    var rain: Boolean = false,
    var atmosphericPressure: Int
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
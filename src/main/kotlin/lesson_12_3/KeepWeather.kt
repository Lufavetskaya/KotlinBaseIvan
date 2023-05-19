package lesson_12_3

class KeepWeather(
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
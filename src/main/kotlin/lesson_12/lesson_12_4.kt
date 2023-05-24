package lesson_12

fun main(){
    val seventhDayLife = KeepWeather4(12, 13, atmosphericPressure = 660)
}

class KeepWeather4(
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
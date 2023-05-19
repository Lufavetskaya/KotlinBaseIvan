package lesson_12_2

class KeepWeather(_temperatureDay: Int, _temperatureNight: Int, _rain: Boolean, _atmosphericPressure: Int) {

    var temperatureDay = _temperatureDay
    var temperatureNight = _temperatureNight
    var rain = _rain
    var atmosphericPressure = _atmosphericPressure

    fun printWeather(){
        println("""Температура днем: $temperatureDay
             |Температура ночь: $temperatureNight
             |Налчиие дождя: $rain
             |Атмосферное давление: $atmosphericPressure
         """.trimMargin())
    }

}
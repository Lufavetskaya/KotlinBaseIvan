package lesson_12

fun main(){
    val thirdDayLife = KeepWeatherTask2(12, 10, true, 660)
    val fourthDayLife = KeepWeatherTask2(0, -50, false, 550)
    val fifthDayLife = KeepWeatherTask2(0, 50, true, 550)

    thirdDayLife.printWeather()
    fourthDayLife.printWeather()
    fifthDayLife.printWeather()
}
class KeepWeatherTask2(_temperatureDay: Int, _temperatureNight: Int, _rain: Boolean, _atmosphericPressure: Int) {

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
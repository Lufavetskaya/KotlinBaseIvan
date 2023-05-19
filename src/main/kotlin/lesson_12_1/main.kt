package lesson_12_1

fun main(){
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
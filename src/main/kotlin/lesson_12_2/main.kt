package lesson_12_2

fun main(){
    val thirdDayLife = KeepWeather(12, 10, true, 660)
    val fourthDayLife = KeepWeather(0, -50, false, 550)
    val fifthDayLife = KeepWeather(0, 50, true, 550)

    thirdDayLife.printWeather()
    fourthDayLife.printWeather()
    fifthDayLife.printWeather()
}
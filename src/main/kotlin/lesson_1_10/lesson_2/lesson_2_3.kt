package lesson_1_10.lesson_2

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeTravelInMinutes = 457
    val hourInTravel = timeTravelInMinutes / 60
    val minuteInTravel = timeTravelInMinutes % 60

    val allminuteOfArrival = minuteOfDeparture + minuteInTravel
    val remainderHourArrival = allminuteOfArrival / 60
    val minuteOfArrival = allminuteOfArrival % 60
    val hourOfArrival = hourOfDeparture + hourInTravel + remainderHourArrival

    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))
}
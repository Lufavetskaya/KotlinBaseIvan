package lesson_2

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeTravelInMinutes = 457
    val hourInTravel = timeTravelInMinutes / 60
    val minuteInTravel = timeTravelInMinutes % 60

    var hourOfArrival = hourOfDeparture + hourInTravel
    var minuteOfArrival = minuteOfDeparture + minuteInTravel

    if (minuteOfArrival > 59) {
        hourOfArrival++
        minuteOfArrival -= 60
    }

    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))
}
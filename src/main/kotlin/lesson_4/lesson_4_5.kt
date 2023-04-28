package lesson_4

val HULL_BREACH = false
val MIN_TEAM_SIZE = 55
val MAX_TEAM_SIZE = 70
val BOX_PROVISION = 50
val GOOD_WEATHER = true

fun main() {
    val thisHullBreach = readln().toBoolean()
    val thisTeamSize = readln().toInt()
    val thisBoxProvision = readln().toInt()
    val thisWeatherGood = readln().toBoolean()

    println("Может корабль покинуть порт: ${((thisHullBreach == HULL_BREACH) && (thisTeamSize >= MIN_TEAM_SIZE && thisTeamSize < MAX_TEAM_SIZE) && (thisBoxProvision > BOX_PROVISION)) || ((thisHullBreach != HULL_BREACH) && (thisTeamSize == MAX_TEAM_SIZE) && (thisBoxProvision > BOX_PROVISION) && (thisWeatherGood == GOOD_WEATHER))}")
}
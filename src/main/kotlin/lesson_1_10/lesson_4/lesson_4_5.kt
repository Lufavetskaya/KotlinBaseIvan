package lesson_1_10.lesson_4

const val HULL_BREACH = false
const val MIN_TEAM_SIZE = 55
const val MAX_TEAM_SIZE = 70
const val BOX_PROVISION = 50
const val GOOD_WEATHER = true

fun main() {
    val thisHullBreach = readln().toBoolean()
    val thisTeamSize = readln().toInt()
    val thisBoxProvision = readln().toInt()
    val thisWeatherGood = readln().toBoolean()

    val canShipLeavePort = (
            (thisHullBreach == HULL_BREACH) &&
                    (thisTeamSize >= MIN_TEAM_SIZE && thisTeamSize < MAX_TEAM_SIZE) &&
                    (thisBoxProvision > BOX_PROVISION)
            ) || (
            (thisHullBreach != HULL_BREACH) &&
                    (thisTeamSize == MAX_TEAM_SIZE) &&
                    (thisBoxProvision > BOX_PROVISION) &&
                    (thisWeatherGood == GOOD_WEATHER))

    println("Может корабль покинуть порт: $canShipLeavePort")
}


package lesson_1_10.lesson_4

const val FACTOR_SUN_FOR_LEGUMES = true
const val FACTOR_OPEN_TENT_FOR_LEGUMES = true
const val FACTOR_AIR_HUMIDITY_FOR_LEGUMES = 20
const val STOP_FACTOR_SEASON_FOR_LEGUMES = "winter"

fun main() {
    val sunToday = true
    val openTentToday = true
    val airHumidityToday = 20
    val seasonToday = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        FACTOR_SUN_FOR_LEGUMES == sunToday && 
                                                                  FACTOR_OPEN_TENT_FOR_LEGUMES == openTentToday && 
                                                                  FACTOR_AIR_HUMIDITY_FOR_LEGUMES == airHumidityToday && 
                                                                  STOP_FACTOR_SEASON_FOR_LEGUMES != seasonToday}")
}
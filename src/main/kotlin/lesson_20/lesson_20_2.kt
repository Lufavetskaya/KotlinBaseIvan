package lesson_20

fun main() {

    val firstPlayer = Player("Kroshentsiya", 50, 100)

    firstPlayer.lambdaPoisonHeal(firstPlayer)
}

class Player(
    val name: String,
    var hpNow: Int,
    val hpMax: Int
){
    val lambdaPoisonHeal: Player.() -> Unit = {
        println("$name выпил большое зелье здоровья.\n+${hpMax - hpNow}HP")
        hpNow = hpMax
        println("Здоровье: $hpNow")
    }
}

package lesson_20

fun main() {
    val lambdaPoisonHeal: (Player) -> Unit = { player ->
        println("${player.name} выпил большое зелье здоровья.\n+${player.hpMax - player.hpNow}HP")
        player.hpNow = player.hpMax
        println("Здоровье: ${player.hpNow}")
    }

    val firstPlayer = Player("Kroshentsiya", 50, 100)

    lambdaPoisonHeal(firstPlayer)
}

class Player(
    val name: String,
    var hpNow: Int,
    val hpMax: Int
)

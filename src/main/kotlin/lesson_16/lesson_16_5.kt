package lesson_16

fun main() {
    val player = Player("Kosh", 40, 70)
    player.heal(60)
    player.damage(100)
    player.heal(50)

}

class Player(
    val namePlayer: String,
    private var hpPlayer: Int,
    var damagePlayer: Int,
) {
    fun heal(heal: Int) {
        if (hpPlayer > 0) {
            hpPlayer += heal
            println("Персонаж похилен на $heal.\nУровень здоровья: $hpPlayer")
        } else println("Персонаж уже отлетел. Нельзя похилить.")
    }

    private fun death() {
        if (hpPlayer <= 0) println("Персонаж погиб")
        hpPlayer = 0
        damagePlayer = 0
    }

    fun damage(damage: Int) {
        hpPlayer -= damage
        println("Персонаж получил урон на $damage.\nУровень здоровья: $hpPlayer")
        death()
    }
}
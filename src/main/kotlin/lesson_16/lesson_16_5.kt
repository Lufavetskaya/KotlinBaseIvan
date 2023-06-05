package lesson_16

fun main() {
    val player = Player("Kosh", 40, 70)
    player.heal(60)
    player.damage(10)
    player.heal(50)
    player.damage(200)
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

    fun damage(damage: Int) {
        hpPlayer -= damage
        println("Персонаж получил урон на $damage.\nУровень здоровья: $hpPlayer")
        checkHP()
    }

    private fun checkHP() {
        if (hpPlayer <= 0) death()
    }

    private fun death() {
        println("Персонаж погиб")
        hpPlayer = 0
        damagePlayer = 0
    }
}
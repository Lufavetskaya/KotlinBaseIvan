package lesson_20

fun main() {
    val lambdaCheckKey: (PlayerKeyFinder) -> Unit = { it: PlayerKeyFinder ->
        if (it.haveKey) println("${it.name} открыл дверь")
        else println("дверь заперта")
    }

    val firstPlayerKeyFinder = PlayerKeyFinder("Bratish")

    lambdaCheckKey(firstPlayerKeyFinder)
    firstPlayerKeyFinder.discoveredKey()
    lambdaCheckKey(firstPlayerKeyFinder)
}

class PlayerKeyFinder(
    val name: String,
    var haveKey: Boolean = false,
) {
    fun discoveredKey() {
        haveKey = true
        println("$name нашел ключ!")
    }
}

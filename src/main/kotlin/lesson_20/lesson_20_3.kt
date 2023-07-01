package lesson_20

fun main() {

    val firstPlayerKeyFinder = PlayerKeyFinder("Bratish")

    firstPlayerKeyFinder.lambdaCheckKey(firstPlayerKeyFinder)
    firstPlayerKeyFinder.discoveredKey()
    firstPlayerKeyFinder.lambdaCheckKey(firstPlayerKeyFinder)
}

class PlayerKeyFinder(
    val name: String,
    var haveKey: Boolean = false,
) {
    fun discoveredKey() {
        haveKey = true
        println("$name нашел ключ!")
    }

    val lambdaCheckKey: PlayerKeyFinder.() -> Unit = {
        if (haveKey) println("${name} открыл дверь")
        else println("дверь заперта")
    }
}

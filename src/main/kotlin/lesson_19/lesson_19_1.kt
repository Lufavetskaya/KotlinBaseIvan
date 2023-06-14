package lesson_19

fun main() {

    println("Вы можете добавить рыбку вида:")
    for (i in AquariumFish.values()) println(i)

}

enum class AquariumFish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESEFIGHTINGFISH,
}

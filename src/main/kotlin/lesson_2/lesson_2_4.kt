package lesson_2

fun main() {
    val lootResCristalOre = 7
    val lootResIronOre = 11
    val buffResOre = 0.2

    val buffLootResCristalOre = lootResCristalOre * buffResOre
    val buffLootIronOre = lootResIronOre * buffResOre

    println(String.format("%.0f", buffLootResCristalOre))
    println(String.format("%.0f", buffLootIronOre))
}
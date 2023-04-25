package lesson_2

fun main() {
    val lootResCrystalOre = 7
    val lootResIronOre = 11
    val buffResOre = 0.2
    val resIronOre = "Iron Ore"
    val resCrystalOre = "Crystal Ore"

    val buffLootResCrystalOre = lootResCrystalOre * buffResOre
    val buffLootIronOre = lootResIronOre * buffResOre

    println(String.format("Bonus %s: %.0f", resCrystalOre, buffLootResCrystalOre))
    println(String.format("Bonus %s: %.0f", resIronOre, buffLootIronOre))
}
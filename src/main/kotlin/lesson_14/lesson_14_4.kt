package lesson_14

fun main() {
    val firstSatellite = Satellite("Moon", "Milky Way")
    val firstPlanet = Planet("Earth", "Milky Way", true, true, true, true)
    firstPlanet.addSatellites(firstSatellite)
    firstPlanet.printInfo()
}

open class CelestialBody(
    val name: String,
    val nameGalaxy: String,
) {
    open fun printInfo() {
        println("Название небесного объекта: $name")
        println("Галактика объекта: $nameGalaxy")
    }
}

open class Planet(
    name: String,
    nameGalaxy: String,
    val inhabited: Boolean = false,
    val atmosphere: Boolean = false,
    val haveWater: Boolean = false,
    val canLanded: Boolean = false,
) : CelestialBody(name, nameGalaxy) {
    val listSatellites = mutableListOf<Satellite>()

    override fun printInfo() {
        println("Название небесного планеты: $name")
        println("Галактика планеты: $nameGalaxy")
        println("Планета населена: $inhabited")
        println("Планета имеет атмосферу: $atmosphere")
        println("На планете есть вода: $haveWater")
        println("Возможна высадка: $canLanded")
        if (listSatellites.isNotEmpty()) {
            print("Спутники планеты: ")
            listSatellites.forEach {
                println(it.name)
            }
        } else println("Спутники не указны или отсуствуют.")

    }

    fun addSatellites(satellites: Satellite) {
        listSatellites.add(satellites)
    }
}

class Satellite (name: String, nameGalaxy: String) : CelestialBody(name, nameGalaxy)
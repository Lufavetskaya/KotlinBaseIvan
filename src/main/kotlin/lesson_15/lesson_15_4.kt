package lesson_15

fun main() {
    val newMusicalInstrument = MusicalInstrument("скрипка", 3)
    newMusicalInstrument.findComponent()
    val newComponent = Component("струна", 60)

}

abstract class UnitGood() {
    abstract val nameUnit: String
    abstract val totalInStock: Int
}

interface FindComponent {
    fun findComponent() {
        println("Выполняется поиск")
    }
}

class MusicalInstrument(override val nameUnit: String, override val totalInStock: Int) : UnitGood(), FindComponent

class Component(override val nameUnit: String, override val totalInStock: Int) : UnitGood()
package lesson_18

fun main() {

    val firstAnimal = Fox("лисица")
    val secondAnimal = Dog("собаченька")
    val thirdAnimal = Cat("котейка")

    val allAnimalArray = arrayOf(firstAnimal, secondAnimal, thirdAnimal)

    fun feedAllAnimal(array: Array<AnimalTamagotchi>) {
        array.forEach {
            println("${it.name} - ${it.eating()}")
        }
    }

    feedAllAnimal(allAnimalArray)

}

open class AnimalTamagotchi(open val name: String) {


    open fun eating(): String {
        return "питается"
    }

    open fun sleeping(): String {
        return "спит"
    }

    open fun playing(): String {
        return "играет"
    }
}

class Fox(
    override val name: String,
) : AnimalTamagotchi(name) {
    override fun eating(): String {
        return "питается ягодами"
    }
}

class Dog(
    override val name: String,
) : AnimalTamagotchi(name) {
    override fun eating(): String {
        return "питается костью"
    }
}

class Cat(
    override val name: String,
) : AnimalTamagotchi(name) {
    override fun eating(): String {
        return "питается рыбой"
    }
}

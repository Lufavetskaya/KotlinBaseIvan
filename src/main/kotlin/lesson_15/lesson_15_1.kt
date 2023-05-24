package lesson_15

fun main() {
    val duck = Duck()
    val seagull = Seagull()
    val crucian = Crucian()

    duck.swimInWater()
    duck.flyInAir()

    seagull.swimInWater()
    seagull.flyInAir()

    crucian.swimInWater()

}

interface Swimming {
    fun swimInWater() {
        println("Существо плавает")
    }
}

interface Flying {
    fun flyInAir() {
        println("Существо летает")
    }
}

class Crucian() : Swimming {
    override fun swimInWater() {
        println("Карась плавает")
    }
}

class Seagull() : Swimming, Flying {
    override fun swimInWater() {
        println("Чайка по сути плавать то умеет")
    }

    override fun flyInAir() {
        println("Чайка летает")
    }
}

class Duck() : Swimming, Flying {
    override fun flyInAir() {
        println("Утка летает")
    }

    override fun swimInWater() {
        println("Утка плавает")
    }
}


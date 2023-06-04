package lesson_16

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val firstCircle = Circle(5.0)
    println("Площадь круга ${firstCircle.areaOfCircle()}")
    println("Длина окружности ${firstCircle.circumference()}")
}

class Circle(private val radius: Double) {
    fun circumference(): Double {
        return 2 * PI * radius
    }

    fun areaOfCircle(): Double {
        return PI * radius.pow(2)
    }
}
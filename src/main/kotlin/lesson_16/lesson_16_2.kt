package lesson_16

import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    val firstCircle = Circle(2.0)
    println("Площадь круга ${firstCircle.areaOfCircle()}")
    println("Длина окружности ${firstCircle.circumference()}")

}

class Circle(private val radius: Double) {
    fun circumference(): Double {
        return 2 * PI * radius
    }

    fun areaOfCircle(): Double {
        return PI * sqrt(radius)
    }
}
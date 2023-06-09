package lesson_14

import java.lang.Math.PI
import kotlin.math.sqrt

const val COLOR_RED = "красный"
const val COLOR_GREEN = "зеленый"
const val COLOR_BLACK = "черный"

fun main() {

    val firstCircle = Circle(COLOR_GREEN, 2.11)
    val secondCircle = Circle(COLOR_RED, 9.0)
    val thirdCircle = Circle(COLOR_BLACK, 2.0)

    val firstRectangle = Rectangle(COLOR_GREEN, 2.11, 3.0)
    val secondRectangle = Rectangle(COLOR_RED, 9.0, 3.0)
    val thirdRectangle = Rectangle(COLOR_BLACK, 2.0, 9.0)

    val firstTriangle = Triangle(COLOR_GREEN, 4.0, 6.0, 5.42)
    val secondTriangle = Triangle(COLOR_RED, 7.0, 7.14, 7.36)
    val thirdTriangle = Triangle(COLOR_BLACK, 2.0, 6.24, 1.13)

    val allFigure = listOf<Figure>(
        firstCircle,
        firstRectangle,
        firstTriangle,
        secondCircle,
        secondRectangle,
        secondTriangle,
        thirdCircle,
        thirdRectangle,
        thirdTriangle
    )


    fun sumAreaAllRedFigure(list: List<Figure>) {
        var sum: Double = 0.0
        for (figure in list) {
            if (figure.color == COLOR_RED) {
                sum += figure.calculateArea()
            }
        }
        println("Сумма площадей красных фигур: $sum")
    }


    fun sumPerimeterAllRedFigure(list: List<Figure>) {
        var sum: Double = 0.0
        for (figure in list) {
            if (figure.color == COLOR_RED) {
                sum += figure.calculatePerimeter()
            }
        }
        println("Сумма периметров красных фигур: $sum")
    }

    sumPerimeterAllRedFigure(allFigure)
    sumAreaAllRedFigure(allFigure)

}

abstract class Figure {
    abstract val color: String
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(override val color: String, val radius: Double) : Figure() {

    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(override val color: String, val length: Double, val height: Double) : Figure() {
    override fun calculateArea(): Double {
        return length * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (length + height)
    }

}

class Triangle(override val color: String, val sideA: Double, val sideB: Double, val sideC: Double) : Figure() {
    override fun calculateArea(): Double {
        val semiperimeterTriangle = (sideA + sideB + sideC) / 2
        return sqrt(semiperimeterTriangle * (semiperimeterTriangle - sideA) * (semiperimeterTriangle - sideB) * (semiperimeterTriangle - sideC))
    }

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

}

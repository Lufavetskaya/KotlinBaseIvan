package lesson_16


fun main() {
    val firstCircle = Circle(25.0)
    println("Площадь круга ${firstCircle.areaOfCircle()}")
    println("Длина окружности ${firstCircle.circumference()}")

}

class Circle(private val radius: Double) {
    private val PI = 3.14

    fun circumference(): Double {
        return 2 * PI * radius
    }

    fun areaOfCircle(): Double {
        return PI * radius * radius
    }
}
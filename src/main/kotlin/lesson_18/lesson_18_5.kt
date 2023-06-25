package lesson_18

fun main() {
    val screen = Screen()

    val dote = Dote("точенька")
    val square = Square("квадаратище", 3)
    val circle = Circle("круруг", 5.0)

    screen.draw(1, 1, dote.name)
    screen.draw(5.9f, 7.7f, dote.name)
    screen.draw(0, 0, square.ribs, square.name)
    screen.draw(4.0f, 2.4f, square.ribs, square.name)
    screen.draw(5, 2, circle.radius, circle.name)
    screen.draw(7.9f, 2.4f, circle.radius, circle.name)

}

class Screen() {
    fun draw(x: Int, y: Int, doteName: String) {
        println("Рисую $doteName в координате ($x, $y)")
    }

    fun draw(x: Float, y: Float, doteName: String) {
        println("Рисую $doteName в координате ($x, $y)")
    }

    fun draw(x: Int, y: Int, ribs: Int, squareName: String) {
        println("Рисую $squareName в координате ($x, $y), длина стороны $ribs")
    }

    fun draw(x: Float, y: Float, ribs: Int, squareName: String) {
        println("Рисую $squareName в координате ($x, $y), длина стороны $ribs")
    }

    fun draw(x: Int, y: Int, radius: Double, circleName: String) {
        println("Рисую $circleName в координате ($x, $y), радиус $radius")
    }

    fun draw(x: Float, y: Float, radius: Double, circleName: String) {
        println("Рисую $circleName в координате ($x, $y), радиус $radius")
    }


}

class Dote(
    val name: String,
)

class Square(
    val name: String,
    val ribs: Int,
)

class Circle(
    val name: String,
    val radius: Double,
)

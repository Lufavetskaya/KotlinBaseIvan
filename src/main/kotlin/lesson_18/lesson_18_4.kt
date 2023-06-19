package lesson_18

fun main() {
    val firstParcelCube = ParcelCube(20.0)
    val secondParcelRectangle = ParcelRectangle(7.0, 5.0, 4.0)

    val arrayParcel = arrayOf(firstParcelCube, secondParcelRectangle)

    fun showAreaAllParcel(array: Array<Parcel>) {
        array.forEach {
            println(it.getSurFaceAre())
        }
    }

    showAreaAllParcel(arrayParcel)
}

abstract class Parcel() {
    abstract fun getSurFaceAre(): Double
}

class ParcelRectangle(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Parcel() {
    override fun getSurFaceAre(): Double {
        return (length * width + length * height + width * height) * 2
    }
}

class ParcelCube(
    private val rib: Double,
) : Parcel() {
    override fun getSurFaceAre(): Double {
        return (rib * rib) * 6
    }
}

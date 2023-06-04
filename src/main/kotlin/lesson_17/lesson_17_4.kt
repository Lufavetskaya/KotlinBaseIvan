package lesson_17

fun main() {
    val firstParcel = Parcel(1, "Tula")
    firstParcel.nowLocation = "Moscow"
    firstParcel.nowLocation = "SPb"
    println("Посылка сейчас в городе: ${firstParcel.nowLocation}\nКоличество перемещений: ${firstParcel.countTransfers}")

}

class Parcel(
    private val NumberParcel: Int,
    private val initLocationParcel: String,
    var countTransfers: Int = 0
) {
    var nowLocation: String = initLocationParcel
        set(value) {
            if (value != field) countTransfers++
            field = value
        }
}
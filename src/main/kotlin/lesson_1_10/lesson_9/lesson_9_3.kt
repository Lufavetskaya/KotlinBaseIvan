package lesson_1_10.lesson_9

fun main() {
    val productForOneOmelet = mutableListOf(2, 50, 15)

    println("Сколько порций омлета готовим?")
    val inputUserPortion = readln().toInt()

    val userPortionOmelet = productForOneOmelet.map { onePortion ->
        onePortion * inputUserPortion
    }

    println(
        """На $inputUserPortion порций вам понадобится:
        |Яиц - ${userPortionOmelet[0]}
        |Молока - ${userPortionOmelet[1]}
        |Сливочного масла - ${userPortionOmelet[2]}""".trimMargin()
    )
}
package lesson_4

const val MIN_WEIGHT_KG_CLASS_AVERAGE = 35
const val MAX_WEIGHT_KG_CLASS_AVERAGE = 100
const val MAX_VOLUME_CLASS_AVERAGE = 100

fun main() {
    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    println(
        "Average для груза с весом $weightCargo1 кг и объемом $volumeCargo1 л: ${
            weightCargo1 in MIN_WEIGHT_KG_CLASS_AVERAGE..MAX_WEIGHT_KG_CLASS_AVERAGE &&
                    MAX_VOLUME_CLASS_AVERAGE > volumeCargo1
        }"
    )
    println(
        "Average для груза с весом $weightCargo2 кг и объемом $volumeCargo2 л: ${
            weightCargo2 in MIN_WEIGHT_KG_CLASS_AVERAGE..MAX_WEIGHT_KG_CLASS_AVERAGE &&
                    MAX_VOLUME_CLASS_AVERAGE > volumeCargo2
        }"
    )
}
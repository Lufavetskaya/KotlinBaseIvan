package lesson_3

fun main() {
    val firstNameCitizen = "Татьяна"
    val lastNameCitizen = "Андреева"
    val patronymicCitizen = "Сергеевна"
    val ageCitizen = 20

    val newLastNameCitizen = "Сидорова"
    val updateAgeCitizen = 22

    println(String.format("%s %s %s, %d", lastNameCitizen, firstNameCitizen, patronymicCitizen, ageCitizen))
    println(String.format("%s %s %s, %d", newLastNameCitizen, firstNameCitizen, patronymicCitizen, updateAgeCitizen))
}


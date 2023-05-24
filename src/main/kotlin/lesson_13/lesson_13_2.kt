package lesson_13

fun main() {
    val annPerson = PhoneContactTask2("Ann", 576_70_07, null)
}

class PhoneContactTask2(val namePerson: String, val phonePerson: Int, val companyPerson: String?) {
    init {
        printInfo()
    }
    fun printInfo() {
        println("Имя: $namePerson\nНомер: $phonePerson\nКомпания: ${companyPerson ?: "[не указано]"}")
    }
}
package lesson_13

fun main() {
    val allContactPerson = mutableListOf<PhoneContactTask3>()

    val annPerson = PhoneContactTask3("Ann", 576_70_07, null)
    val gochaPerson = PhoneContactTask3("Gocha", null, null)
    val kroshPerson = PhoneContactTask3("Krosh", 289_46_86, "workwork")
    val gavrPerson = PhoneContactTask3(null, null, "workwork")

    allContactPerson.add(annPerson)
    allContactPerson.add(gochaPerson)
    allContactPerson.add(kroshPerson)
    allContactPerson.add(gavrPerson)

    printContactList(allContactPerson)

}

fun printContactList(list: MutableList<PhoneContactTask3>) {
    for (i in list) {
        println("Имя: ${i.namePerson ?: "[не указано]"}\nНомер: ${i.phonePerson ?: "[не указано]"}\nКомпания: ${i.companyPerson ?: "[не указано]"}\n")
    }
}

class PhoneContactTask3(val namePerson: String?, val phonePerson: Int?, val companyPerson: String?) {
}
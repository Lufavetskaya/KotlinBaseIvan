package lesson_13

val listAllContactPerson = mutableListOf<PhoneContactTask5>()

fun main() {
    inputUserContact5()
    printContactList5(listAllContactPerson)
}

fun inputUserContact5() {
    println("Добавьте хотя бы 1 конаткт:")
    do {
        val newContact = PhoneContactTask5()

        println("Введите имя")
        newContact.namePerson = readln()

        println("Введите номер телефона")
        val phoneContact = readln()
        if (phoneContact.isNotEmpty()) {
            checkInputNum(phoneContact, newContact)
        }

        println("Введите компанию")
        newContact.companyPerson = readln()

        addContactUser5(newContact)

        println("Хотите создать еще контакт")
        val goodAnswerForAdd = "Да"
    } while (readln() == goodAnswerForAdd)
}

fun addContactUser5(contact: PhoneContactTask5) {
    if (contact.phonePerson == null) println("Контакт без номера не будет добавлен")
    else listAllContactPerson.add(contact)
}

fun printContactList5(list: List<PhoneContactTask5>) {
    for (i in list) {
        println("Имя: ${i.namePerson ?: "[не указано]"}\nНомер: ${i.phonePerson ?: "[не указано]"}\nКомпания: ${i.companyPerson ?: "[не указано]"}\n")
    }
}

fun checkInputNum(string: String, contact: PhoneContactTask5) {
    try {
        contact.phonePerson = string.toLong()
    } catch (e: NumberFormatException) {
        println("номер может содержать только цифры.")
    }
}

class PhoneContactTask5() {
    var namePerson: String? = null
    var phonePerson: Long? = null
    var companyPerson: String? = null
}
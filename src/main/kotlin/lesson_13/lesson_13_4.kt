package lesson_13

val allContactPerson = mutableListOf<PhoneContactTask4>()

fun main() {
    inputUserContact()


    printContactList(allContactPerson)
}

fun inputUserContact() {
    println("Добавьте хотя бы 1 конаткт:")
    do {
        val newContact = PhoneContactTask4()

        println("Введите имя")
        newContact.namePerson = readln()

        println("Введите номер телефона")
        val phoneContact = readln()
        if (phoneContact.isNotEmpty()) {
            newContact.phonePerson = phoneContact.toInt()
        }

        println("Введите компанию")
        newContact.companyPerson = readln()

        addContactUser(newContact)

        println("Хотите бросить кости еще раз Введите Да или Нет")
        val goodAnswerForAdd = "Да"
    } while (readln() == goodAnswerForAdd)
}

fun addContactUser(contact: PhoneContactTask4) {
    if (contact.phonePerson == null) println("Контакт без номера не будет добавлен")
    else allContactPerson.add(contact)
}

fun printContactList(list: MutableList<PhoneContactTask4>) {
    for (i in list) {
        println("Имя: ${i.namePerson ?: "[не указано]"}\nНомер: ${i.phonePerson ?: "[не указано]"}\nКомпания: ${i.companyPerson ?: "[не указано]"}\n")
    }
}

class PhoneContactTask4() {
    var namePerson: String? = null
    var phonePerson: Int? = null
    var companyPerson: String? = null

    constructor(_namePerson: String?, _phonePerson: Int?, _companyPerson: String?) : this() {
        namePerson = _namePerson
        phonePerson = _phonePerson
        companyPerson = _companyPerson
    }
}
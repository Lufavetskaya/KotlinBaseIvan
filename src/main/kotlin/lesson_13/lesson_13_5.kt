package lesson_13

val allContactPerson = mutableListOf<PhoneContactTask5>()

fun main() {
    inputUserContact5()
    printContactList5(allContactPerson)
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

        println("Хотите бросить кости еще раз Введите Да или Нет")
        val goodAnswerForAdd = "Да"
    } while (readln() == goodAnswerForAdd)
}

fun addContactUser5(contact: PhoneContactTask5) {
    if (contact.phonePerson == null) println("Контакт без номера не будет добавлен")
    else allContactPerson.add(contact)
}

fun printContactList5(list: MutableList<PhoneContactTask5>) {
    for (i in list) {
        println("Имя: ${i.namePerson ?: "[не указано]"}\nНомер: ${i.phonePerson ?: "[не указано]"}\nКомпания: ${i.companyPerson ?: "[не указано]"}\n")
    }
}

fun checkInputNum(string: String, contact: PhoneContactTask5) {
    val rangeABC = ('a'..'z')
    val rangeABCD = ('A'..'Z')

    val arrayCharString = string.toCharArray()
    for (i in arrayCharString) {
        if (i in rangeABC || i in rangeABCD) {
            println("Номер может содержать только  цифры")
            break
        } else {
            contact.phonePerson = string.toLong()
        }
    }
}

class PhoneContactTask5() {
    var namePerson: String? = null
    var phonePerson: Long? = null
    var companyPerson: String? = null

    constructor(_namePerson: String?, _phonePerson: Long?, _companyPerson: String?) : this() {
        namePerson = _namePerson
        phonePerson = _phonePerson
        companyPerson = _companyPerson
    }
}
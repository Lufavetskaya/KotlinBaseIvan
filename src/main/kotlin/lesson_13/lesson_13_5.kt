package lesson_13

val listAllContactPerson = mutableListOf<PhoneContactTask5>()

fun main() {
    inputUserContact5()
    printContactList5(listAllContactPerson)
}

fun inputUserContact5() {
    println("Добавьте хотя бы 1 контакт:")
    do {
        println("Введите имя")
        val namePerson = readln()

        println("Введите номер телефона")
        val inputUserPhoneString: String = readln()
        val phonePerson = checkInputNum(inputUserPhoneString)

        println("Введите компанию")
        val companyPerson = readln()

        val newContact = PhoneContactTask5(namePerson, phonePerson, companyPerson)
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
        println("Имя: ${i.namePerson?.takeIf { !it.isNullOrEmpty() } ?: "[не указано]"}\nНомер: ${i.phonePerson}\nКомпания: ${i.companyPerson?.takeIf { !it.isNullOrEmpty() } ?: "[не указано]"}\n")
    }
}

fun checkInputNum(string: String): Long? {
    return try {
        string.toLong()
    } catch (e: NumberFormatException) {
        println("номер может содержать только цифры.")
        null
    }
}

class PhoneContactTask5(
    val namePerson: String? = null,
    val phonePerson: Long?,
    val companyPerson: String? = null,
)
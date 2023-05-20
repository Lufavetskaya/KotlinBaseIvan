package lesson_11

fun main() {

    val firstContact = Contact(
        avatarPerson = "link avatar",
        firstNamePerson = "Wife",
        phoneNumberPersonMain = "8 (999) 999-00-00",
        emailPerson = "wife@mail.com"
    )

    val secondContact = Contact(
        avatarPerson = "link avatar",
        firstNamePerson = "Friend1",
        phoneNumberPersonMain = "8 (999) 999-11-11",
        emailPerson = "friend1@mail.com"
    )

    val thirdContact = Contact(
        avatarPerson = "link avatar",
        firstNamePerson = "Friend2",
        phoneNumberPersonMain = "8 (999) 999-22-22",
        emailPerson = "friend2@mail.com"
    )

    val fourthContact: Contact = Contact(
        avatarPerson = "link avatar",
        firstNamePerson = "First Name",
        lastNamePerson = "Last Name",
        phoneNumberPersonMain = "8 (999) 999-42-42",
        phoneNumberPersonHome = "8 (999) 999-42-42",
        emailPerson = "mail@mail.ru",
        spousePerson = firstContact.firstNamePerson,
        setFavoritesFriends = setOf(secondContact.firstNamePerson, thirdContact.firstNamePerson)

    )

}


class Contact(
    val avatarPerson: String,
    val firstNamePerson: String,
    val lastNamePerson: String = "",
    val phoneNumberPersonMain: String,
    val phoneNumberPersonHome: String = "",
    val emailPerson: String,
    var setFavoritesFriends: Set<String> = setOf(),
    var spousePerson: String = "",
) {
    fun sendMessPerson() {}

    fun callPerson() {}

    fun videoCallPerson() {}

    fun sendEmailPerson() {}

    fun addFavorites() {}


}
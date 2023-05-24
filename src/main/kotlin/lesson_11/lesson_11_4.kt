package lesson_11

fun main() {

    val firstContact = FavoritesContact("Wife", "spouse")
    val secondContact = FavoritesContact("Friend1", "friends")
    val thirdContact = FavoritesContact("Friend2", "friends")

    val fourthContact: Contact = Contact(
        avatarPerson = "link avatar",
        firstNamePerson = "First Name",
        lastNamePerson = "Last Name",
        phoneNumberPersonMain = "8 (999) 999-42-42",
        phoneNumberPersonHome = "8 (999) 999-42-42",
        emailPerson = "mail@mail.ru",
        favoritesContact = listOf(firstContact, secondContact, thirdContact)
    )
}

class Contact(
    val avatarPerson: String,
    val firstNamePerson: String,
    val lastNamePerson: String = "",
    val phoneNumberPersonMain: String,
    val phoneNumberPersonHome: String = "",
    val emailPerson: String,
    var favoritesContact: List<FavoritesContact>,
) {
    fun sendMessPerson() {}

    fun callPerson() {}

    fun videoCallPerson() {}

    fun sendEmailPerson() {}

    fun addFavorites() {}
}

class FavoritesContact(
    val name: String,
    val typeFavorites: String,
)
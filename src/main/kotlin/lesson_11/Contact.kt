package lesson_11

class Contact(
    val avatarPerson: String,
    val firstNamePerson: String,
    val lastNamePerson: String = "",
    val phoneNumberPersonMain: String,
    val phoneNumberPersonHome: String = "",
    val emailPerson:  String,
    var setFavoritesFriends: Set<String> = setOf(),
    var spousePerson: String = "",

    ) {
    fun sendMessPerson(){}

    fun callPerson(){}

    fun videoCallPerson(){}

    fun sendEmailPerson(){}

    fun addFavorites(){}


}
package lesson_11

fun main() {
    val firstUserA: UserChat = UserChat("Банан", "ссылка на картинку")
    val secondUserA: UserChat = UserChat("Ананас", "ссылка на картинку")

    val roomOne = CardRoom(
        avatarRoom = "link",
        nameRoom = "Room One",
        setUser = setOf(firstUserA.avatarUser, secondUserA.avatarUser)
    )

    val firstUserB: UserChat = UserChat("Стейк", "ссылка на картинку")
    val secondUserB: UserChat = UserChat("Картошка", "ссылка на картинку")
    val thirdUserB: UserChat = UserChat("Лук", "ссылка на картинку")
    val fourthUserB: UserChat = UserChat("Помидорка", "ссылка на картинку")

    val roomTwo = CardRoom(
        avatarRoom = "link",
        nameRoom = "Room Two",
        setUser = setOf(firstUserB.avatarUser, secondUserB.avatarUser, thirdUserB.avatarUser, fourthUserB.avatarUser)
    )

    val setRoom = setOf<CardRoom>(roomOne, roomTwo)
}
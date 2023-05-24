package lesson_14

fun main() {

    val message1 = MessageForum("Gocha", "Мы нашли совесткую монетку!")

    val post1 = message1.printMess()

    val comment1 = CommentForum("Krosh", "Какой молоддец, братиш!")

    comment1.printComment(post1)

}

open class MessageForum(
    val nameAuthor: String?,
    val messageAuthor: String?,
) {
    fun printMess(): String {
        val message = "Пост от Автора: $nameAuthor\nТекст поста: $messageAuthor"
        println(message)
        return message
    }

}

class CommentForum(
    nameAuthor: String?,
    messageAuthor: String?,
) : MessageForum(nameAuthor, messageAuthor) {

    fun printComment(post: String) {
        println(post)
        println("Коммент от Автора: $nameAuthor\nТекст коммента: $messageAuthor")
    }
}
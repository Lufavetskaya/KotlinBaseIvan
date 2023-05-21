package lesson_14

fun main() {

    val message1 = MessageForum("Gocha", "Мы нашли совесткую монетку!")
    val comment1 = CommentForum("Krosh", "Какой молоддец, братиш!")

    comment1.printComment(message1.printMess())

}

open class MessageForum(
    val nameAuthor: String?,
    val messageAuthor: String?,
) {
    fun printMess(): String {
        return "Пост от Автора: $nameAuthor\nТекст поста: $messageAuthor"
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
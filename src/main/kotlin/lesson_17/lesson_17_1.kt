package lesson_17

fun main() {

    val firstQuestion = TopicQuiz()
    firstQuestion.question = "Что такое нагори(яп.)?"
    firstQuestion.answer = "След волн"
    println("Вопрос: ${firstQuestion.question}\nОтвет: ${firstQuestion.answer}")

}

class TopicQuiz() {
    var question: String = ""
        set(newQuestion: String) {
            field = newQuestion
        }

    var answer: String = ""
        get() = field
        set(newAnswer: String) {
            field = newAnswer
        }
}
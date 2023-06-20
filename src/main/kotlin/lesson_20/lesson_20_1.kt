package lesson_20

fun main(){
    val nameUser = "Tony"

    println({it: String -> "С наступающим Новым Годом, $it!"}(nameUser))
}

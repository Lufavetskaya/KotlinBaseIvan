package lesson_1_10.lesson_2

fun main(){
    val gradeStudentA = 3
    val gradeStudentB = 4
    val gradeStudentC = 3
    val gradeStudentD = 5
    var sumAllGrades = 0

    val allGradeClassABCD = mutableListOf(gradeStudentA, gradeStudentB, gradeStudentC, gradeStudentD)

    for (grades in allGradeClassABCD) {
        sumAllGrades += grades
    }

    val averageGradeClass: Float = (sumAllGrades / (allGradeClassABCD.size.toFloat()))

    println(String.format("%.2f", averageGradeClass))
}
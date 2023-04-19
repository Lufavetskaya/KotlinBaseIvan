package lesson_2

fun main(){
    val gradeStudentA = 3
    val gradeStudentB = 4
    val gradeStudentC = 3
    val gradeStudentD = 5
    var sumAllGrades = 0

    var allGradeClassABCD = mutableListOf(gradeStudentA, gradeStudentB, gradeStudentC, gradeStudentD)

    for(grades in allGradeClassABCD){
        var grade = grades
        sumAllGrades += grade
    }

    var averageGradeClass: Float = (sumAllGrades/(allGradeClassABCD.size.toFloat()))

    println(String.format("%.2f", averageGradeClass))
}
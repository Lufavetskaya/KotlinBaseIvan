package lesson_2

fun main() {
    val fullTimeWorkers = 50
    val salaryFullTimeWorker = 30_000
    val internWorkers = 30
    val salaryInternWorker = 20_000

    val budgetFullTimeWorker = fullTimeWorkers * salaryFullTimeWorker
    val allBudget = budgetFullTimeWorker + (internWorkers * salaryInternWorker)
    val averageSalaryForAllWorkers = allBudget / (fullTimeWorkers + internWorkers)

    println(budgetFullTimeWorker)
    println(allBudget)
    println(averageSalaryForAllWorkers)
}

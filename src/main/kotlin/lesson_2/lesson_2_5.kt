package lesson_2

import kotlin.math.pow

fun main() {
    val amountOfClientsMoney = 70_000
    val annualInterestRate = 16.7
    val totalYears = 20

    val finalClientsMoney = amountOfClientsMoney * (1 + annualInterestRate / 100).pow(totalYears)

    println(String.format("%.3f", finalClientsMoney))
}
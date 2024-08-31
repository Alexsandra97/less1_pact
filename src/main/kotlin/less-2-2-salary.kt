package org.example

fun main() {

    val oldWorkers = 50
    val newWorkers = 30
    val salaryOldWorkers = 30000
    val salaryNewWorkers = 20000

    val AllSalaryOldWork = oldWorkers * salaryOldWorkers
    val AllSalary = AllSalaryOldWork + newWorkers * salaryNewWorkers
    val mediumSalary = AllSalary / (oldWorkers + newWorkers)

    println("Расходы на выплату зарплаты постоянных сотрудников: $AllSalaryOldWork")
    println("Общие расходы по ЗП после прихода стажеров: $AllSalary")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $mediumSalary")

}
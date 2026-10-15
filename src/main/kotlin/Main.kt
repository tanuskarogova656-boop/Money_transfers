package ru.netology

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
fun main() {
    val amount = 50.0
    val minimumCommission = 35.0
    val commissionRate = 0.0075

    val calculatedCommission = amount * commissionRate
    val result: Double = if (calculatedCommission > minimumCommission) {
        calculatedCommission
    } else {
        minimumCommission
    }

    println("Сумма перевода: $amount руб.")
    println("Комиссия: ${"%.2f".format(result)} руб.")
}
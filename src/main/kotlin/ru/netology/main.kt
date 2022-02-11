package ru.netology

fun main() {
    val amount = 7000000
    val feeRate = 0.0075
    val minFee = 3500

    val feeAmount = amount * feeRate
    val feeAmountInt: Int = feeAmount.toInt()
    val actualFee = if (feeAmount < minFee) minFee else feeAmountInt
    println("Сумма перевода: $amount копеек")
    println("Комиссия: $actualFee копеек")

}
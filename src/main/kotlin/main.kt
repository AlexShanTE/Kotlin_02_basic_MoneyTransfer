fun main() {
    val amount = 1_000_000
    val commissionPercentage = 0.75
    val commissionValue = amount / 100 * commissionPercentage
    val minimalCommission = 3500

    val realCommission = if (minimalCommission >= commissionValue) minimalCommission else commissionValue
    println("Комиссия составит : ${realCommission.toInt()} копеек")

}
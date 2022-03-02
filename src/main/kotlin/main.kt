fun main() {
    val amount = 1000000
    val basicCommission = 0.0075  //percentage
    val minimalCommission = 3500  //value

    val realCommission = if (minimalCommission >= amount * basicCommission) minimalCommission else amount * basicCommission
    println("Комиссия составит : ${realCommission.toInt()} копеек")
}
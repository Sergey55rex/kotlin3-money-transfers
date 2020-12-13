fun main() {
    val transferAmount = 11000000
    val previousTransfers = 0
    val cardType = "MasterCard"

    val result = feeAmount (cardType, transferAmount, previousTransfers)


}

fun feeAmount(cardType: String, transferAmount: Int, previousTransfers: Int): Int {
    val sum= when (cardType) {
        "MasterCard", "Maestro" -> if (transferAmount < 7500000) 0 else (0.6 * transferAmount / 100 + 2000).toInt()
        "Visa", "Мир" -> (0.75 * transferAmount / 100).toInt()
        else -> 0
    }
    
    val limitDay =  if ("Vk Pay" == cardType)  1500000 else 15000000
    val limitMonth = if ("Vk Pay" == cardType)  4000000 else 60000000
    if (previousTransfers > limitMonth || transferAmount > limitDay) println("Превышен лимит. Транзакция невозможна") else println("Коммиссия за перевод денежных средств составит: $sum копеек")
    val previousTransfers =+ transferAmount
     return sum
}

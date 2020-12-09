fun main() {
    var transferAmount = 11000000
    var previousTransfers = 0
    var limit = 15000000
    var cardType = "MasterCard"
    var commission  = feeAmount (cardType, transferAmount)

        if ("Vk Pay" == cardType) limit = 1500000 else 15000000
        if ((previousTransfers + transferAmount) > limit) println("Превышен лимит. Транзакция невозможна") else println("Коммиссия за перевод денежных средств составит: $commission копеек")
}
fun feeAmount(cardType: String, transferAmount: Int): Any {
    val sum= when (cardType) {
        "Vk Pay" ->  0
        "MasterCard" -> if (transferAmount < 7500000) 0 else (0.6 * transferAmount / 100 + 2000).toInt()
        "Maestro" -> if (transferAmount < 7500000) 0 else (0.6 * transferAmount / 100 + 2000).toInt()
        "Visa" -> (0.75 * transferAmount / 100).toInt()
        "Мир" -> (0.75 * transferAmount / 100).toInt()
        else -> 0
    }
    return sum
}

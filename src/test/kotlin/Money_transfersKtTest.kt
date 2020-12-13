import org.junit.Assert.*
import org.junit.Test

class Money_transfersKtTest{
    @Test
    fun feeAmountMaster() {
        val transfer  = 11000000
        val previous  = 0
        val card  = "MasterCard"

        val result= feeAmount(
            cardType = card ,
            previousTransfers = previous,
            transferAmount = transfer
        )
        val expected = 68000

        assertEquals(expected, result)
    }
    @Test
    fun feeAmountVisa() {
        val transfer  = 1100000
        val previous  = 0
        val card  = "Visa"

        val result= feeAmount(
            cardType = card ,
            previousTransfers = previous,
            transferAmount = transfer
        )
        val expected = 8250

        assertEquals(expected, result)
    }

    @Test
    fun feeAmountVkPay() {
        val transfer  = 3000000
        val previous  = 0
        val card  = "Vk Pay"

        val result= feeAmount(
            cardType = card ,
            previousTransfers = previous,
            transferAmount = transfer
        )
        val expected =  0

        assertEquals(expected, result)
    }

    @Test
    fun feeAmountMaestro() {
        val transfer  = 1100000
        val previous  = 0
        val card  = "Maestro"

        val result= feeAmount(
                cardType = card ,
                previousTransfers = previous,
                transferAmount = transfer
        )
        val expected =   0

        assertEquals(expected, result)
    }

    @Test
    fun feeAmountMir() {
        val transfer  = 1000000
        val previous  = 150000000
        val card  = "Мир"

        val result= feeAmount(
                cardType = card ,
                previousTransfers = previous,
                transferAmount = transfer
        )
        val expected =  75000

        assertEquals(expected, result)
    }
}



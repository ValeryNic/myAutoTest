import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun myTransferCard1() {
        val result = ru.netology.myTransferCard("Maestro", 75000, 1000)
        assertEquals(26, result)
    }

    @Test
    fun myTransferCard2() {
        val result = ru.netology.myTransferCard("Mastercard", 75000, 1000)
        assertEquals(26, result)
    }

    @Test
    fun myTransferCard3() {
        val result= ru.netology.myTransferCard("Maestro", 74000,1000)
        assertEquals(0,result)
    }
    @Test
    fun myTransferCard4() {
        val result= ru.netology.myTransferCard("Mastercard", 74000,1000)
        assertEquals(0,result)
    }
    @Test
    fun myTransferCard5() {
        val result= ru.netology.myTransferCard("Maestro", 500000,150000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard6() {
        val result= ru.netology.myTransferCard("Mastercard", 500000,150000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard7() {
        val result= ru.netology.myTransferCard("Maestro", 300000,160000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard8() {
        val result= ru.netology.myTransferCard("Mastercard", 300000,160000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard9() {
        val result= ru.netology.myTransferCard("Visa", 0,20)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard10() {
        val result= ru.netology.myTransferCard("Visa", 400000,160000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard11() {
        val result= ru.netology.myTransferCard("Visa", 460000,150000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard12() {
        val result= ru.netology.myTransferCard("Visa", 450000,150000)
        assertEquals(1125,result)
    }
    @Test
    fun myTransferCard13() {
        val result= ru.netology.myTransferCard("Мир", 0,20)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard14() {
        val result= ru.netology.myTransferCard("Мир", 400000,160000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard15() {
        val result= ru.netology.myTransferCard("Мир", 460000,150000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard16() {
        val result= ru.netology.myTransferCard("Мир", 450000,150000)
        assertEquals(1125,result)
    }
    @Test
    fun myTransferCard17() {
        val result= ru.netology.myTransferCard("VK Pay", 0,16000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard18() {
        val result= ru.netology.myTransferCard("VK Pay", 26000,15000)
        assertEquals(-2,result)
    }
    @Test
    fun myTransferCard19() {
        val result= ru.netology.myTransferCard("VK Pay", 25000,15000)
        assertEquals(0,result)
    }
    @Test
    fun myTransferCard20() {
        val result= ru.netology.myTransferCard("Mastro", 10000,1000)
        assertEquals(-1,result)
    }
}
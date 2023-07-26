import Ex3.Numeros
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumerosTest {

    val numeros = Numeros()

    @Test
    fun lerCincoNumerosERetornarOMaior(){
        val numerosArray = arrayOf(8,6,3,5,9)

        val maiorValor =  numeros.lerNumerosERetornaOMaior(numerosArray)

        assertEquals(9,maiorValor)
    }
}
import Ex2.DiaSemana
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DiaSemanaTest {
    val dia = DiaSemana()

    @Test
    fun lernumeroEretornarDomingo(){
       val diaDaSemana = dia.lerNumero(1)
       assertEquals("Domingo", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSegunda(){
        val diaDaSemana = dia.lerNumero(2)
        assertEquals("Segunda-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarTerca(){
        val diaDaSemana = dia.lerNumero(3)
        assertEquals("Terça-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarQuarta(){
        val diaDaSemana = dia.lerNumero(4)
        assertEquals("Quarta-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarQuinta(){
        val diaDaSemana = dia.lerNumero(5)
        assertEquals("Quinta-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSexta(){
        val diaDaSemana = dia.lerNumero(6)
        assertEquals("Sexta-Feira", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSabado(){
        val diaDaSemana = dia.lerNumero(7)
        assertEquals("Sábado", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarInvalido(){
        val diaDaSemana = dia.lerNumero(8)
        assertEquals("Valor Inválido", diaDaSemana)
    }
}
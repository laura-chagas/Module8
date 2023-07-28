import Exercicio.Compra
import Exercicio.Frutas
import Exercicio.Laranja
import Exercicio.Maca
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CompraTest{
    var carrinho = mutableListOf<Frutas>()
    var novaCompra = Compra()

    //ETAPA 1
    @Test
    fun `verificar se a fruta esta sendo adicionada corretamente na lista carrinho`(){
        val novaLaranja = Laranja("Laranja", 0.25)
        carrinho.add(novaLaranja)
        assertTrue(carrinho.contains(novaLaranja))
    }
    @Test
    fun `verificar se a fruta esta sendo retirada corretamente da lista carrinho`(){
        val novaLaranja = Laranja("Laranja", 0.25)
        carrinho.remove(novaLaranja)
        assertFalse(carrinho.contains(novaLaranja))
    }
    @Test
    fun `deve retornar o valor total corretamente`(){
        carrinho.add(Laranja("Laranja",0.25))
        carrinho.add(Maca("Maçã",0.60))
        carrinho.add(Maca("Maçã",0.60))
        carrinho.add(Maca("Maçã",0.60))

        val valorRetornado = novaCompra.calcularTotal(carrinho)

        assertEquals(2.05,valorRetornado)
    }
    @Test
    fun `deve estourar uma excecao ao receber uma lista vazia`(){
        val novaListadeFrutas = mutableListOf<Frutas>()
        assertThrows<IllegalArgumentException> {novaCompra.calcularTotal(novaListadeFrutas)}
    }

    //ETAPA 2
    @Test
    fun `verificar se o a lista esta sendo alterada ao escolher uma oferta com maca`(){
       carrinho.add(Maca("Maçã",0.60))
       novaCompra.comprarComOfertas(1, carrinho)
       assertTrue(carrinho.size == 3)
    }
    @Test
    fun `verificar se o a lista esta sendo alterada ao escolher uma oferta com laranja`(){
       carrinho.add(Laranja("Laranja",0.25))
       novaCompra.comprarComOfertas(2, carrinho)
       assertTrue(carrinho.size == 4)
    }
    @Test
    fun `deve estourar uma excecao ao receber uma opcao diferente de 1 e 2`(){
        assertThrows<IllegalArgumentException> { novaCompra.comprarComOfertas(0,carrinho) }
    }

    //ETAPA 3
    @Test
    fun `verificar se a notificacao esta funcionando corretamente e retorna true`(){
        val novaLaranja = Laranja("Laranja", 0.25)
        carrinho.add(novaLaranja)
        val resultadoEsperado = novaCompra.notificarCliente(carrinho)
        assertEquals(true, resultadoEsperado )
    }
    @Test
    fun `verificar se a notificacao de aviso caso a lista esteja vazia esta funcionando corretamente e retorna false`(){
        val resultadoEsperado = novaCompra.notificarCliente(carrinho)
        assertFalse(resultadoEsperado )
    }

    //ETAPA 4
    @Test
    fun `deve retornar true ao passar o codigo 1 e quantidade valida`(){
        val respostaEsperada = novaCompra.comprarPeloEstoque(1,2,carrinho)
        assertTrue(respostaEsperada)
    }
    @Test
    fun `deve retornar true ao passar o codigo 2 e quantidade valida`(){
        val respostaEsperada = novaCompra.comprarPeloEstoque(2,3,carrinho)
        assertTrue(respostaEsperada)
    }
    @Test
    fun `deve retornar false ao passar uma quantidade invalida`(){
        val respostaEsperada = novaCompra.comprarPeloEstoque(1,6,carrinho)
        assertFalse(respostaEsperada)
    }
    @Test
    fun `deve estourar a IllegalArgumentException ao passar um codigo nao existente`(){
        assertThrows<IllegalArgumentException> {novaCompra.comprarPeloEstoque(4,2,carrinho)}
    }

}
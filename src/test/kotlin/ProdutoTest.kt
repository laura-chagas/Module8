import Ex1.Produto
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ProdutoTest {
    @Test
    fun retornarProdutoMaisBarato(){
        val arrayProdutos = arrayOf(12.1,2.50,77.25)
        val produtos = Produto()

       val produtoMaisBaratoEsperado = produtos.produtoMaisBarato(arrayProdutos)

        assertEquals(2.50, produtoMaisBaratoEsperado)

    }
}
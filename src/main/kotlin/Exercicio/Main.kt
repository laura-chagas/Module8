package Exercicio

fun main() {
    val carrinho = mutableListOf<Frutas>()
    val compra = Compra()

    //ETAPA 1

    carrinho.add(Laranja("Laranja", 0.25))
    carrinho.add(Maca("Maçã", 0.60))
    carrinho.add(Maca("Maçã", 0.60))
    carrinho.add(Maca("Maçã", 0.60))

   for (i in carrinho){
        println("FRUTA: ${i.nome}      PREÇO: ${i.preco}")
    }

    println("TOTAL: R$%.2f".format(compra.calcularTotal(carrinho)))

    // ETAPA 2

    carrinho.clear()
    println(compra.calcularTotal(compra.comprarComOfertas(2, carrinho)))
    println(compra.calcularTotal(compra.comprarComOfertas(1, carrinho)))
    println(compra.calcularTotal(compra.comprarComOfertas(0, carrinho)))


    //ETAPA 3
   compra.notificarCliente(carrinho)
    carrinho.clear()
    compra.notificarCliente(carrinho)

    //ETAPA 4
    println("FRUTAS DISPONÍVEIS: \n[1] Maça: 3      [2] Laranja: 5")
    println("Informe o código da fruta para comprar e a quantidade que deseja: ")
    compra.comprarPeloEstoque(1, 3, carrinho)
    for (i in carrinho){
        println("FRUTA: ${i.nome}      PREÇO: ${i.preco}")
    }
}
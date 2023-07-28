package Exercicio

class Compra {

    //ETAPA 1
    fun calcularTotal(carrinho: MutableList<Frutas>): Double {
        var valorTotal: Double = 0.0
        if (carrinho.isNotEmpty()) {
            for (fruta in carrinho) {
                valorTotal += fruta.preco
            }
        } else {
            throw IllegalArgumentException("O carrinho está vazio :(")
        }
        return valorTotal
    }

    //ETAPA 2
    fun comprarComOfertas(opc: Int, carrinho: MutableList<Frutas>): MutableList<Frutas> {
        when (opc) {
            1 -> {
                carrinho.add(Maca("Maçã", 0.60))
                carrinho.add(Maca("Maçã", 0.0))
            }

            2 -> {
                carrinho.add(Laranja("Laranja", 0.25))
                carrinho.add(Laranja("Laranja", 0.25))
                carrinho.add(Laranja("Laranja", 0.0))
            }

            else -> {
                throw java.lang.IllegalArgumentException("Opção inválida")
            }
        }
        println()
        for (i in carrinho) {
            println("FRUTA: ${i.nome}      PREÇO: ${i.preco}")
        }
        return carrinho
    }

    //ETAPA 3
    fun notificarCliente(carrinho: MutableList<Frutas>): Boolean {
        return if (carrinho.isNotEmpty()) {
            println("Seu pedido está sendo preparado :) ")
            Thread.sleep(3000)
            println("\nSeu pedido saiu para entrega :) \nTempo estimado: 30 minutos")
            Thread.sleep(5000)
            println("\nSeu pedido foi entregue! Avalie-nos na plataforma dos Correios :) ")
            Thread.sleep(3000)
            true
        } else {
            println("\nPoxa não há produtos em seu carrinho, compre algo e volte aqui para tentarmos novamente ;)")
            false
        }

    }

    //ETAPA 4
    fun comprarPeloEstoque(codigo:Int,qtd:Int,listaDeCompra:MutableList<Frutas>):Boolean{
        if (codigo==1){
            when{
                qtd in 1..5 -> {
                    for (i in 1..qtd){
                        listaDeCompra.add(Maca("Maça",0.60))
                    }
                    println("Compra efetuada com sucesso!")
                    return true
                }
                else -> {
                    println("A quantidade solicitada não está disponível para esse produto")
                }
            }
        }
        else if(codigo==2){
            when{
                qtd in 1..10 -> {
                    for (i in 1..qtd){
                        listaDeCompra.add(Laranja("Laranja",0.25))
                    }
                    println("Compra efetuada com sucesso!")
                    return true
                }
                else -> {
                    println("A quantidade solicitada não está disponível para esse produto!")
                }
            }
        }
        else{
            throw IllegalArgumentException("Opção de produto inválida")
        }
        return false
    }
}

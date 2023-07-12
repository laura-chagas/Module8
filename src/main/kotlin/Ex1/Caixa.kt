package Ex1

class Caixa {
    var arrayProduct = arrayListOf<Product>()

    fun productRegister(prod: Product) {
        arrayProduct.add(prod)
    }

    fun showProducts() {
        productPreReg()

        println("-------LISTA DE PRODUTOS-------")
        for (i in arrayProduct) {
            println("Nome: ${i.nameProduct} \nQuantidade: ${i.qtdProduct} \nPreço: ${i.priceProduct}")
            println()
        }

    }
    fun productPreReg(){
        arrayProduct.add(Product("Banana", 5, 2.5))
    }
    fun totalProduct() {
       productPreReg()
        var pdE = true
        println("O Qual produto você deseja? ")
        var produto = readln()

        for (i in arrayProduct) {
            if (i.nameProduct.equals(produto, ignoreCase = true)) {
                pdE = true
                println("Informe a quantidade de produtos que você deseja comprar: ")
                val qtdCompra = readln().toInt()

                if (qtdCompra <= i.qtdProduct) {
                    val total = i.priceProduct * qtdCompra
                    println("Valor total da compra: R$$total")
                    println("COMPRA REGISTRADA COM SUCESSO")
                    i.qtdProduct -= qtdCompra

                } else {
                    println("A quantidade de itens que você vai comprar é maior que a quantidade de itens no estoque")
                }
                break
            }
            else  {
                println("Esse produto não está cadastrado!")
            }

        }




    }


}
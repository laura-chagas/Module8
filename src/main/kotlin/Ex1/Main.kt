package Ex1

import java.lang.IllegalArgumentException

val box = Caixa()

fun main() {

    println("VOCÊ É: \n[1]FUNCIONÁRIO       [2]CLIENTE")
    val deci = readln().toInt()

    when {
        deci == 1 -> {
            menuFun()
        }

        deci == 2 -> {
            menuCli()
        }

        else -> {
            throw IllegalArgumentException("Opção inválida")
        }
    }


}

fun menuFun() {
    var system = true
    do {
        println("VOCÊ DESEJA: \n[1]CADASTRAR PRODUTOS     [2]EXIBIR PRODUTOS     [3]SAIR")
        val dec = readln().toInt()

        if (dec == 1) {
            for (i in 1..5) {
                println("Informe um nome: ")
                var nameProduct = readln()
                println("Informe a quantidade: ")
                var qtdProduct = readln().toInt()
                println("Informe o preço: ")
                var priceProduct = readln().toDouble()
                println()
                var prod = Product(nameProduct, qtdProduct, priceProduct)
                box.productRegister(prod)
            }
            println("PRODUTOS CADASTRADOS COM SUCESSO")

        } else if (dec == 2) {
            box.showProducts()
        } else if (dec == 3) {
            println("ENCERRANDO SISTEMA...")
            system = false
        } else {
            throw IllegalArgumentException("Opção inválida")
        }
    } while (system)

}

fun menuCli() {
    var system = true
    do {
        println("VOCÊ DESEJA: \n[1]REGISTRAR COMPRA     [2]EXIBIR PRODUTOS     [3]SAIR")
        val dec = readln().toInt()

        if (dec == 1) {
            box.totalProduct()

        } else if (dec == 2) {
            box.showProducts()
        } else if (dec == 3) {
            println("ENCERRANDO SISTEMA...")
            system = false
        } else {
            throw IllegalArgumentException("Opção inválida")
        }


    } while (system)

}
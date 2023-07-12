package Ex1

import java.time.LocalDate
import kotlin.system.exitProcess

fun main() {
    val spmkt = Supermarket()
    spmkt.supermarketMenu()
}

class Supermarket {
    private var food = foodProducts("",0, LocalDate.now())
    private var clean = cleaninProducts("",0, LocalDate.now())
    private var toy = toysProducts("",0, LocalDate.now())
    private var stopSystem=true

    fun supermarketMenu(){
        do {
            println("Você deseja:\n[1]Cadastrar produto    [2]Ver produtos     [3]Sair")
            val escolha = readln().toIntOrNull()
            when(escolha){
                1 -> {choiceMenu() }
                2 -> {showProductsMenu()}
                3 -> {println("Encerrando Programa...")
                    exitProcess(0)}
                else -> {
                    println("Opção inválida!")
                    stopSystem=false
                }
            }
        }while (!stopSystem)
    }

    fun choiceMenu(){
        do {
            println("Deseja cadastrar qual tipo de produto:\n[1]ALIMENTOS:    [2]LIMPEZA     [3]BRINQUEDOS    [4]VOLTAR")
            val choice = readln().toIntOrNull()
            when(choice){
                1 -> {food.registerProduct()
                    println("CADASTRO REALIZADO")
                    choiceMenu()}
                2 -> {clean.registerProduct()
                    println("CADASTRO REALIZADO")
                    choiceMenu()}
                3 -> {toy.registerProduct()
                    println("CADASTRO REALIZADO")
                    choiceMenu()}
                4 -> supermarketMenu()
                else -> {
                    println("Opção inválida!")
                    stopSystem=false
                }
            }
        }while (!stopSystem)
    }

    fun showProductsMenu(){
        do {
            println("Deseja ver qual produto:\n[1]ALIMENTOS:    [2]LIMPEZA     [3]BRINQUEDOS    [4]VOLTAR")
            val choice = readln().toIntOrNull()
            when(choice){
                1 -> {food.showProducts()
                    showProductsMenu()}
                2 -> {clean.showProducts()
                    showProductsMenu()}
                3 -> {toy.showProducts()
                    showProductsMenu()}
                4 -> {supermarketMenu()}
                else -> {
                    println("Opção inválida!")
                    stopSystem=false
                }
            }
        }while (!stopSystem)
    }
}

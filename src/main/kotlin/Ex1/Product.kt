package Ex1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Product (var nameProduct: String, var codeProduct: Int, var expirationDate: LocalDate) {
    open fun registerProduct(){
        println("NOME DO PRODUTO: ")
        nameProduct = readln()
        println("CODIGO DO PRODUTO: ")
        codeProduct = readln().toInt()
        println("DATA DE VALIDADE: [DD/MM/YYY]")
        var data = readln()
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        expirationDate = LocalDate.parse(data,formatter)
    }

    open fun showProducts(){
        println("-------LISTA DE PRODUTOS-------")

    }
}

class foodProducts(nameProduct: String, codeProduct: Int, expirationDate: LocalDate): Product(nameProduct,codeProduct, expirationDate){
    var foodProductArray = ArrayList<foodProducts>()
    override fun registerProduct() {
        super.registerProduct()
        foodProductArray.add(foodProducts(nameProduct, codeProduct, expirationDate))
    }

    override fun showProducts() {
        super.showProducts()
        for (i in foodProductArray){
            println("Nome: ${i.nameProduct} \nCódigo de Barras: ${i.codeProduct} \nData de validade: ${i.expirationDate}")
        }
        println()
    }
}

class cleaninProducts(nameProduct: String, codeProduct: Int, expirationDate: LocalDate): Product(nameProduct,codeProduct, expirationDate){

    var cleaninProducts = ArrayList<cleaninProducts>()
    override fun registerProduct() {
        super.registerProduct()
        cleaninProducts.add(cleaninProducts(nameProduct, codeProduct, expirationDate))
    }

    override fun showProducts() {
        super.showProducts()
        for (i in cleaninProducts){
            println("Nome: ${i.nameProduct} \nCódigo de Barras: ${i.codeProduct} \nData de validade: ${i.expirationDate}")
        }
        println()
    }
}

class toysProducts(nameProduct: String, codeProduct: Int, expirationDate: LocalDate): Product(nameProduct,codeProduct, expirationDate){

    var toysProducts = ArrayList<toysProducts>()
    override fun registerProduct() {
        super.registerProduct()
        toysProducts.add(toysProducts(nameProduct, codeProduct, expirationDate))
    }

    override fun showProducts() {
        super.showProducts()
        for (i in toysProducts){
            println("Nome: ${i.nameProduct} \nCódigo de Barras: ${i.codeProduct} \nData de validade: ${i.expirationDate}")
        }
        println()
    }
}
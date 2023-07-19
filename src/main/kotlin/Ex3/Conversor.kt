package Ex3

import java.math.BigDecimal
import java.time.LocalDate

class Conversor {
    val hojeE = LocalDate.now();
    val alerta = "O sistema só converte moedas para real!"

    fun converterDolar(){
        println(alerta)
        val cotacaoUSD = BigDecimal(4.80)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $hojeE:\nA cotação Dólar Americano está em: US$${cotacaoUSD.toDouble()}\n"+
                            "O valor que será convertido é de: US$${valor.toDouble()}\n" +
                            "O valor convertido em real é: R$${valor.multiply(cotacaoUSD).toDouble()}")
                }
                else{
                    println("Valor inválido, por favor, tente novamente")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")

            }
        }while (!continuar)
    }

    fun converterDolarCa(){
        println(alerta)
        val cotacaoCAD = BigDecimal(3.65)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $hojeE:\nA cotação Dólar Canadense está em: C$${cotacaoCAD.toDouble()}"+
                            "\nO valor que será convertido é de: C$${valor.toDouble()}" +
                            "\nO valor convertido em real é: R$${valor.multiply(cotacaoCAD).toDouble()}")
                }
                else{
                    println("Valor inválido, por favor, tente novamente")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")

            }
        }while (!continuar)
    }

    fun converterEURO(){
        println(alerta)
        val cotacaoEUR = BigDecimal(5.37)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $hojeE:\nA cotação Euro está em: €${cotacaoEUR.toDouble()}"+
                            "\nO valor que será convertido é de: €${valor.toDouble()}" +
                            "\nO valor convertido em real é: R$${valor.multiply(cotacaoEUR).toDouble()}")
                }
                else{
                    println("Valor inválido, por favor, tente novamente")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")

            }
        }while (!continuar)
    }

    fun converterLibra(){
        println(alerta)
        val cotacaoLIBRES = BigDecimal(5.37)
        var continuar = true
        do {
            try {
                println("Informe a quantidade que deseja converter:")
                val valor = BigDecimal(readln().toDouble())
                val verificarValor = valor.toInt()
                if (!(verificarValor<=0)){
                    println("No dia $hojeE:\nA cotação da Libra Esterlina está em: £${cotacaoLIBRES.toDouble()}"+
                            "\nO valor que será convertido é de: £${valor.toDouble()}" +
                            "\nO valor convertido em real é: R$${valor.multiply(cotacaoLIBRES).toDouble()}")
                }
                else{
                    println("Valor inválido, por favor, tente novamente")
                    continuar=false
                }
            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor monetário deve ser um número decimal")

            }
        }while (!continuar)
    }
}

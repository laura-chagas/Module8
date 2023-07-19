package Ex3

class Menu {

    fun Menu() {
        println("===WELCOME====")
    }

    fun decisaoMenu() {
        val conv = Conversor()
        try {
            println("ESCOLHA A MOEDA: \n[1] Dolar\n[2] Dolar Canadense\n[3] Euro\n[4] Libra Esterlina")
            when (readln().toInt()) {
                1 -> conv.converterDolar()
                2 -> conv.converterDolarCa()
                3 -> conv.converterEURO()
                4 -> conv.converterLibra()
                else -> throw IllegalArgumentException()
            }
        } catch (exception:IllegalArgumentException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: ${exception.message}")
            decisaoMenu()
        } finally {
            println("Deseja fazer uma nova conversão? \n[1] Sim \n[2] Não")
            when (readln().toInt()) {
                1 -> decisaoMenu()
                2 -> {
                    println("Programa Encerrado")
                    System.exit(0)
                }

                else -> {
                    println("Inválido")
                    decisaoMenu()
                }
            }
        }
    }
}
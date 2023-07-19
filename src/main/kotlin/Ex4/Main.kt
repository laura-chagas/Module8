package Ex4


fun main() {
        val cr = UserClass()

        var system = true
        do {
            println("Você deseja:\n[1]Cadastrar-se | [2]Ver Informações | [3]Calcular os impostos | [4]Sair")
            when(readln().toInt()) {
                1 -> {cr.registerUser()}
                2 -> {cr.showInfos()}
                3 -> {cr.calculateTax()}
                4 -> {System.exit(0) }
                else -> {
                    println("Opção inválida")
                    system = false
                }
            }
        }while (system)
    }

package Ex2

fun main() {

    menuPrincipal()

}

private val livroAutoAjuda = AutoAjuda("","")
private val livroFiccaoCientifica = FiccaoCientifica("","")
private val livroRomance = Romance("","")
private var continuar = true

fun menuPrincipal() {
    do {
        println("Você deseja:\n[1]Cadastrar livro    [2]Ver livros        [3]Sair")
        val escolha = readln().toIntOrNull()
        when (escolha) {
            1 -> {
                menuEscolha()
            }

            2 -> {
                menuExibir()
            }

            3 -> {
                println("Encerrando Sistema... ")
                System.exit(0)
            }

            else -> {
                println("Opção inválida!")
                continuar = false

            }
        }
    } while (!continuar)
}

fun menuEscolha() {
    do {
        println("Deseja cadastrar qual gênero de livro:\n[1]Romance     [2]Ficção Científica    [3]Auto-Ajuda      [4]Voltar")
        val escolha = readln().toIntOrNull()
        when (escolha) {
            1 -> {
                livroRomance.cadastrarLivro()
                menuEscolha()
            }

            2 -> {
                livroFiccaoCientifica.cadastrarLivro()
                menuEscolha()
            }

            3 -> {
                livroAutoAjuda.cadastrarLivro()
                menuEscolha()
            }

            4 -> {
                menuPrincipal()
            }

            else -> {
                continuar = false
                println("Opção inválida!")
            }
        }
    } while (!continuar)
}

fun menuExibir() {
    do {
        println("Deseja ver qual gênero de livro:\n[1]Romance     [2]Ficção Científica    [3]Auto-Ajuda      [4]Voltar")
        val escolha = readln().toIntOrNull()
        when (escolha) {
            1 -> {
                livroRomance.mostrarLivros()
                menuExibir()
            }

            2 -> {
                livroFiccaoCientifica.mostrarLivros()
                menuExibir()
            }

            3 -> {
                livroAutoAjuda.mostrarLivros()
                menuExibir()
            }

            4 -> menuPrincipal()
            else -> {
                println("Opção inválida!")
                continuar = false
                
            }
        }
    } while (!continuar)
}
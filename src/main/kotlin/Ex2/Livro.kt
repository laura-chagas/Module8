package Ex2

open class Livro (var nome: String, var autor: String) {
    open fun cadastrarLivro(){
        println("Digite o nome do livro: ")
        nome = readln()
        println("Digite o autor do livro: ")
        autor = readln()
    }
    open fun mostrarLivros(){
        println("-------LIVROS-------")

    }
}

class Romance(nome: String, autor: String): Livro(nome, autor){
    var livrosRomance = ArrayList<Romance>()

    override fun cadastrarLivro() {
        super.cadastrarLivro()
        livrosRomance.add(Romance(nome, autor))
    }

    override fun mostrarLivros() {
        super.mostrarLivros()
        for (i in livrosRomance){
            println("Nome: ${i.nome} \nAutor: ${i.autor}")
        }
        println()
    }
}

class FiccaoCientifica(nome: String, autor: String): Livro(nome, autor){
    var livrosFiccaoCientifica = ArrayList<FiccaoCientifica>()

    override fun cadastrarLivro() {
        super.cadastrarLivro()
        livrosFiccaoCientifica.add(FiccaoCientifica(nome, autor))
    }

    override fun mostrarLivros() {
        super.mostrarLivros()
        for (i in livrosFiccaoCientifica){
            println("Nome: ${i.nome} \nAutor: ${i.autor}")
        }
        println()
    }
}

class AutoAjuda(nome: String, autor: String): Livro(nome, autor){
    var livrosAutoAjuda = ArrayList<AutoAjuda>()

    override fun cadastrarLivro() {
        super.cadastrarLivro()
        livrosAutoAjuda.add(AutoAjuda(nome, autor))
    }
    override fun mostrarLivros() {
        super.mostrarLivros()
        for (i in livrosAutoAjuda){
            println("Nome: ${i.nome} \nAutor: ${i.autor}")
        }
        println()
    }
}
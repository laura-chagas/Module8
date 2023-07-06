package Ex2

fun main() {
    val livroFavorito = Livros("O pequeno príncipe", 98, 20)
    println("O livro '${livroFavorito.titulo}' possui '${livroFavorito.qtPaginas}' páginas")
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    var livrosArray = ArrayList<Livros>()
    livrosArray.add(Livros("Torto arado", 264, 62))
    livrosArray.add(Livros("Diário de um banana - Um romance em quadrinhos", 218, 115))
    livrosArray.add(Livros("A biblioteca da meia-noite", 308, 200))
    livrosArray.add(Livros("Os sete maridos de Evelyn Hugo", 360, 92))
    livrosArray.add(Livros("Jujutsu Kaisen 0", 200, 104))
    livrosArray.add(Livros("O Hobbit", 328, 300))
    livrosArray.add(Livros("Vermelho, branco e sangue azul", 392, 390))
    livrosArray.add(Livros("Moby Dick", 656, 458))
    livrosArray.add(Livros("Dom Quixote", 1857, 1245))
    livrosArray.add(Livros("Quincas Borba", 360, 0))
    println()
    for (livro in livrosArray) {
        println("Titulo: ${livro.titulo}")
        livro.verificarProgresso()
        livro.paginasLidas = 50
        livro.verificarProgresso()
        println()
    }


}
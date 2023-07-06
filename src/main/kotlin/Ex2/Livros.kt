package Ex2

class Livros (var titulo: String, var qtPaginas: Int, var paginasLidas: Int) {
    fun verificarProgresso(){
        val porcent = (paginasLidas * 100) / qtPaginas
        println("Você já leu '$porcent%' do Livro")
    }
}
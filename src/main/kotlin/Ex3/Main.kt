package Ex3

fun main() {
    val filmUm = Filmes("Os Vingadores", 142)
    filmUm.exibirDuracaoEmHoras()
    println()
    val filmDois = Filmes("Hotel Transilvânia", 93)
    filmDois.exibirDuracaoEmHoras()
    println()
    println("Os filmes em cartaz são '${filmUm.titulo}' e '${filmDois.titulo}' ")

    var filmArray = ArrayList<Filmes>()
    filmArray.add(Filmes("A Era do Gelo", 81))
    filmArray.add(Filmes("Interestelar", 169))
    filmArray.add(Filmes("A Chegada", 119))
    filmArray.add(Filmes("Coringa", 140))
    filmArray.add(Filmes("Us",121))
    println("--------------------------------------------------")
    for (film in filmArray) {
        film.exibirDuracaoEmHoras()
        println()
    }
    println("------FILMES EM CARTAZ------")
    for (films in filmArray){
        println("'${films.titulo}' ")
    }
}
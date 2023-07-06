package Ex3

import kotlin.time.Duration.Companion.minutes

class Filmes (var titulo: String, var minutos: Int) {

    fun exibirDuracaoEmHoras(){
        var horaDuracao = minutos.minutes
        println("O filme '$titulo' possui '$horaDuracao' de duração")
    }
}
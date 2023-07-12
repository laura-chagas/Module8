package Ex3

class Time(var nome: String, var qtdJogadores: Int, var vitorias: Int, var esporte: String) {
    fun exibir() {
        println("Clube: ${nome}\nNúmero de jogadores: ${qtdJogadores}" +
                "\nVitorias: ${vitorias}\nEsporte: ${esporte}")
    }
}
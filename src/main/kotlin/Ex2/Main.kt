package Ex2

fun main() {
    val ppl1 = Pessoa(0,0,0,0,"Albert Einsten")
    ppl1.ajustarDataDenascimento(14,3,1879)
    ppl1.calcularIdade()
    println("Se ${ppl1.informarNome()} estivesse vivo, teria ${ppl1.informarIdade()} anos. ")

    val ppl2 = Pessoa(0,0,0,0,"Isaac Newton")
    ppl2.ajustarDataDenascimento(4,1,1643)
    ppl2.calcularIdade()
    println("Se ${ppl2.informarNome()} estivesse vivo, teria ${ppl2.informarIdade()} anos. ")

    val ppl3 = Pessoa(0,0,0,0,"Laura Xavier")
    ppl3.ajustarDataDenascimento(13,5,2003)
    ppl3.calcularIdade()
    println("${ppl3.informarNome()} tem ${ppl3.informarIdade()} anos. ")
}

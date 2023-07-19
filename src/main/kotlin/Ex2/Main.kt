package Ex2

fun main() {
    var numbersList = mutableSetOf<Int>()

    numbersList.addAll(listOf(1, 5, 5, 6, 7, 8, 8, 8))

    println(numbersList)

    //A diferença do exercicício 2 para o 1 é que o uso do mutableSetOf() não permite valores repetidos, diferente do mutableListOf

}
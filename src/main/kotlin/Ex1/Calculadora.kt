package Ex1

fun main() {
    val calc = CalculoMatematico()

//    calc.divisao(4,0)
    do {
        println("Digite um número inteiro:")
        val dividendo = readln().toInt()
        println("Digite outro número inteiro:")
        val divisor = readln().toInt()
        val resultado = calc.divisao(dividendo,divisor)

        if (resultado==0){
            println()
        }
        else{
            println("Resultado: $resultado")
        }
    }while (resultado==0)
}


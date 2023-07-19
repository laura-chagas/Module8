package Ex1

class CalculoMatematico {
    fun divisao(n1: Int, n2: Int): Int {
        try {
            if (n1 > n2) {
                return n1 / n2
            }
            return n2 / n1
        } catch (exception: ArithmeticException) {
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: Não é possível realizar a divisão com o número ZERO")
        }
        return 0
    }
}
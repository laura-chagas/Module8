package Ex6

class ContaCorrente(agencia: Int, conta: Int, nomeCliente: String, saldo: Double) :
    Conta(agencia, conta, nomeCliente, saldo) {


    override fun sacar(valor: Double) {
        super.sacar(valor)
        consultarSaldo()
    }


    override fun depositar(valor: Double, empregado: Boolean) {
        if (valor > 5000) {
            println("Operação inválida, procure a sua agência")
        } else {
            super.depositar(valor, empregado)
            consultarSaldo()
        }

    }
}
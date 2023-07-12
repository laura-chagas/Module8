package Ex6

class ContaPoupanca(agencia: Int, conta: Int, nomeCliente: String, saldo: Double) :
    Conta(agencia, conta, nomeCliente, saldo) {

    override fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente! ")
        } else {
            super.sacar(valor)
            consultarSaldo()
        }
    }

    override fun depositar(valor: Double, empregado: Boolean) {
        if (!empregado) {
            super.depositar(valor, empregado)
            consultarSaldo()
        } else {
            println("Conta Poupança só pode receber depósito do usuário")
        }

    }
}
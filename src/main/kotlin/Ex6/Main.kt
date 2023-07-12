package Ex6

fun main() {
    val contaS = ContaSalario(9098,186579429, "Meire", 1200.00)
    contaS.sacar(140.0)
    contaS.depositar(100.00,true)
    println("--------------------------------")

    val contaSal = ContaSalario(8008,275468318, "Ribamar", 1200.00)
    contaSal.sacar(1400.0)
    contaSal.depositar(1400.00,false)
    println("--------------------------------")


    val contaP = ContaPoupanca(1234,654987123, "Victor Hugo", 0.0)
    contaP.sacar(200.00)
    contaP.depositar(200.00, false)
    println("--------------------------------")

    val contaPoup = ContaPoupanca(4321,543876012, "Roberta", 0.0)
    contaPoup.sacar(0.00)
    contaPoup.depositar(200.00, true)
    println("--------------------------------")


    val contaC = ContaCorrente(6584,417852963, "Suzzana", 4000.00)
    contaC.sacar(3000.00)
    contaC.depositar(5000.00, true)
    println("--------------------------------")


    val contaCor = ContaCorrente(5473,306741892, "Vanderlei", 6000.00)
    contaCor.sacar(7000.00)
    contaCor.depositar(5000.00, true)
    println("--------------------------------")

}
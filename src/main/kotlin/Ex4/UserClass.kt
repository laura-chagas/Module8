package Ex4


class UserClass() {

    private var userName: String = ""
    private var userOccupation: String = ""
    private var userSalary = mutableListOf<Double>()
    private var registered = mutableListOf<UserClass>()

    constructor(userName: String, userOccupation: String, salaryList: MutableList<Double>) : this() {
        this.userName = userName
        this.userOccupation = userOccupation
        this.userSalary = salaryList
    }

    fun registerUser() {
        println("NOME: ")
        var name = readln()
        println("PROFISSAO")
        var occupation = readln()

        var localSalary = mutableListOf<Double>()
        for (i in 1..12) {
            println("Informe o salário do mês $i : ")
            localSalary.add(readln().toDouble())
        }
        registered.add(UserClass(name, occupation, localSalary))

    }

    fun showInfos() {
        println("-------INFORMAÇÕES DO USUÁRIO-------")
        for (obj in registered) {
            println("Nome: ${obj.userName} \nProfissão: ${obj.userOccupation} \nSalários: ${obj.userSalary}")
        }
    }

    fun calculateTax() {
        for (usuario in registered) {
            println("-----------Cáculo de Imposto Por Mês do Usuário ${usuario.userName}----------------")
            for (valor in usuario.userSalary) {
                when {
                    valor in 0.00..2000.00 -> {
                        println("Isento")
                    }

                    valor in 2001.00..3000.00 -> {
                        println("Imposto do mês: R$%.2f".format(valor * 0.08))
                    }

                    valor in 3001.00..4500.00 -> {
                        println("Imposto do mês: R$%.2f".format(valor * 0.18))
                    }

                    valor > 4500.00 -> {
                        println("Imposto do mês: R$%.2f".format(valor * 0.28))
                    }
                }

            }
        }

    }

}




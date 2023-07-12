package Ex4

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Funcionario(var nomeCompleto: String, var setor: String, var salario: Double, var dataAdmissao: String) {
    fun exibir() {
        val formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        var dataAdm = LocalDate.parse(dataAdmissao, formatar)

        println(
            "Nome Completo: ${nomeCompleto}\nSetor: ${setor}" +
                    "\nSalário: ${salario}\nData de Admissão: ${dataAdm}"
        )
    }
}
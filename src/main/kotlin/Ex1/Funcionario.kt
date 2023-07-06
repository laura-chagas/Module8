package Ex1

class Funcionario(var nome: String, var sobrenome: String, var horasTrabalhadas: Int, var valorPorHora: Double) {
    fun nomeCompleto(): String {
        return "Nome Completo : $nome $sobrenome"
    }
    fun calcularSalario(){
        var salario = horasTrabalhadas * valorPorHora
        println("Salário: $salario")
    }

    fun incrementarHoras(horasAmais: Int){
        horasTrabalhadas += horasAmais
    }
}
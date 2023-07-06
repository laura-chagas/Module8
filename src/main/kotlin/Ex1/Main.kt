package Ex1

fun main() {
    val novoFuncionario = Funcionario("Luis", "Silva", 10, 25.50)

    println(novoFuncionario.nomeCompleto())
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    var funcionariosArray = ArrayList<Funcionario>()
    funcionariosArray.add(Funcionario("Laura", "Xavier", 12, 64.50))
    funcionariosArray.add(Funcionario("Milena", "Lopes", 8, 50.00))
    funcionariosArray.add(Funcionario("Vitoria", "Cerqueira", 4, 300.0))
    funcionariosArray.add(Funcionario("Amanda", "Santos", 8, 55.00))
    funcionariosArray.add(Funcionario("Carolina", "Queiroz", 12, 40.00))
    funcionariosArray.add(Funcionario("Valquiria", "Pereira", 8, 90.00))
    funcionariosArray.add(Funcionario("Fernando", "Gomes", 5, 50.00))
    funcionariosArray.add(Funcionario("Ronaldo", "Fenômeno", 12, 100.00))
    funcionariosArray.add(Funcionario("Bruno", "Marcos", 4, 60.00))
    println()
    for (funcionario in funcionariosArray){
        println("\nNome: ${funcionario.nome+" "+funcionario.sobrenome} \nHoras trabalhadas: ${funcionario.horasTrabalhadas} | Valor por hora: ${funcionario.valorPorHora}")
        println()
    }


}
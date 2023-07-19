package Ex5

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Aluno(
    var matricula: Int,
    var nome: String,
    var sobrenome: String,
    var sexo: String,
    var dataDeNascimento: LocalDate
)

class Turma {

    var alunoLista = arrayListOf<Aluno>()
    val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    fun alunosCadastrados(){
        alunoLista.add(Aluno(123, "LAURA", "XAVIER ", "FEM", LocalDate.parse("13/05/2003", formato)))
        alunoLista.add(Aluno(144, "AMANDA", "SOUZA", "FEM", LocalDate.parse("11/05/2002", formato)))
    }
    fun cadastrarAluno() {
        print("MATRICULA: ")
        var matricula = readln().toInt()
        while (verificarMatricula(matricula)) {
            println("Matrícula já existente, tente novamente!")
            matricula = readln().toInt()
        }
        print("NOME: ")
        val nome = readln()
        print("SOBRENOME: ")
        val sobrenome = readln()
        print("SEXO: ")
        val sexo = readln()

        print("DATA DE NASCIMENTO: ")
        val dataDeNascimentoReal = LocalDate.parse(readln(), formato)

        val aluno = Aluno(matricula, nome, sobrenome, sexo, dataDeNascimentoReal)
        alunoLista.add(aluno)

    }

    private fun verificarMatricula(input: Int): Boolean {
        for (alunos in alunoLista) {
            if (alunos.matricula.equals(input)) {
                return true
            }
        }
        return false
    }

    fun mostrarAlunos() {
        var numero = 1
        println("-------Alunos-------")
        for (i in alunoLista) {
            println("${numero}º aluno: ${i.nome}")
            numero++
        }
        println("---------------------")

    }

    fun mostrarAlunosComSobrenome() {
        var numero = 1
        println("-------Alunos-------")
        for (i in alunoLista) {
            println("${numero}º aluno: ${i.nome} ${i.sobrenome}")
            numero++
        }
    }

    fun mostrarAlunoIdoso() {

        val alunoMaisVelho = alunoLista.minByOrNull { alunoLista -> alunoLista.dataDeNascimento }

        if (alunoMaisVelho != null) {
            println("aluno mais velho é: ${alunoMaisVelho.nome}")
        }
    }

    fun calcularMedia() {

        var arrayAge = arrayOf<Int>()

        for (i in alunoLista) {
            val idade = 2023 - i.dataDeNascimento.year
            arrayAge = arrayAge.plus(idade)
        }

        val med = arrayAge.sum() / arrayAge.size

        println("A média de idade dos alunos é: $med")
    }

    fun atualizarDadosDoAluno() {
        println("Informe a matrícula: ")
        val matricula = readln().toInt()
        for (aluno in alunoLista) {
            if (aluno.matricula.equals(matricula)) {
                print("Informe o novo nome do aluno: ")
                aluno.nome = readln()
                print("Novo nome: ${aluno.nome} - Salvo com sucesso!")
                return
            }
        }
        println("Não foi encontrado matrícula para o aluno informado. ")
    }

    fun removerAluno(){
        print("Informe a matrícula: ")
        val matricula = readln().toInt()
        for (aluno in alunoLista) {
            if (aluno.matricula.equals(matricula)){
                alunoLista.remove(aluno)
                print("Aluno removido com sucesso!")
                return
            }
        }
        println("Não foi encontrado matrícula para o aluno informado. ")
    }
}

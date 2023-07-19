package Ex5

fun main(){
    val turma = Turma()
    turma.alunosCadastrados()
    do {
        println("Você deseja:\n[1]Cadastrar aluno\n[2]Listar alunos\n[3]Listar alunos com sobrenome\n[4]Ver aluno mais velho\n[5]Ver média das idades\n[6]Atualizar dados\n[7]Remover dados\n[8]Sair")
        val opcao = readln().toInt()
        when(opcao){
            1 -> {turma.cadastrarAluno()}
            2 -> {turma.mostrarAlunos()}
            3 -> {turma.mostrarAlunosComSobrenome()}
            4 -> {turma.mostrarAlunoIdoso()}
            5 -> {turma.calcularMedia()}
            6 -> {turma.atualizarDadosDoAluno()}
            7 -> {turma.removerAluno()}
            8 -> {System.exit(0)}
            else -> {
                println("Opção inválida!")
            }
        }
    }while (opcao != 8)
}
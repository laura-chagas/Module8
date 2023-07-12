package Ex3

import kotlin.system.exitProcess

class GradeSystem {
    private var arrayGrade = arrayOf<Double>()
         get() {return field}
         set(value){field = value}

    internal fun receiveGrade() {
        var n1: Double?
        for (i in 1..4) {
            print("Digite a ${i}º nota [a nota precisa ser de 0 a 10]: ")
            n1 = readln().toDoubleOrNull()
            while (n1 == null || !(n1 >= 0 && n1 <= 10)) {
                println("Nota inválida, digite a ${i}º novamente \n[LEMBRETE: a nota precisa estar entre 0 e 10]: ")
                n1 = readln().toDoubleOrNull()
            }
            arrayGrade = arrayGrade.plus(n1)
        }
        calculate(arrayGrade)

            }

    internal fun calculate(arrayG: Array<Double>){
        val mStudents = arrayG.sum() / 4

        println("-------MÉDIA = $mStudents-------")
    }

    internal fun menuOpc(){
        println("Novo calculo? \n[1] SIM       [2]NÃO")
        val dec = readln().toIntOrNull()
        when {
            dec == 1 -> {
                arrayGrade = arrayOf()
                receiveGrade()}
            dec == 2 -> { exitProcess(0) }
            else -> { menuOpc() }
        }

    }


}



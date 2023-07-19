package Ex6

class GuardaVolumes {
    var cont: Int = 0
    var dicionario = mutableMapOf<Int, ArrayList<SaveTheRoupa>>()

    fun guardarPecas(listaDePeca: ArrayList<SaveTheRoupa>): Int {
        ++cont
        dicionario[cont] = listaDePeca
        return cont
    }

    fun mostrarPecas() {
        for ((chave, valor) in dicionario) {
            println("Identificação: $chave")
            for (peca in valor) {
                println("Marca:${peca.marca}\nModelo:${peca.modelo}\n")
            }
        }
    }

    fun pesquisarPorId(id: Int){
        for (key in dicionario.keys){
            if (key.equals(id)){
                println("Para a ID: $id Encontrei: ")
                for (peca in  dicionario.getValue(id)){
                    println("Marca: ${peca.marca} & Modelo: ${peca.modelo} ")

                }
                return
            }

        }
        println("Infelizmente não encontrei.")
    }

    fun devolverPeca(num:Int){
        if (dicionario.containsKey(num)){
            dicionario.remove(num)
            println("Sua peça foi devolvida")
        }
        else{
            println("Identificador inválido!")
        }
    }

}



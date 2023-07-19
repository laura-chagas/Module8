package Ex2

abstract class ProdutosPGramas(var nome: String, var pesoEmGrama: Double) {
    abstract fun cadastrarProduto()
    abstract fun mostrarValores()

}

abstract class ProdutosPUnidade(var nome: String, var pesoEmUnidade: Int) {
    abstract fun cadastrarProduto()
    abstract fun mostrarValores()
}


class VerdurasClass(nome: String, pesoEmGrama: Double) : ProdutosPGramas(nome, pesoEmGrama) {
    var verduraList = arrayListOf<VerdurasClass>()

    override fun cadastrarProduto() {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()) {
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                while (grama.isNullOrBlank()) {

                    throw UnsupportedOperationException()

                }

                if (!grama.contains('.') || grama.contains('-') || grama == "0") {

                    throw NumberFormatException()
                }

                verduraList.add(VerdurasClass(nome, grama.toDouble()))

            } catch (exception: UnsupportedOperationException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")


            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para verdura, a quantidade deve ser informada com ponto")

            }


    }

    override fun mostrarValores() {
        println("-------LISTA DE VERDURAS-------")
        if (verduraList.isEmpty()) {
            println("Você não comprou nenhuma verdura")
        } else {
            println("A quantidade a ser comprada de verduras é ${verduraList.size}")
            for (i in verduraList) {
                println("Nome: ${i.nome}    Peso em gramas: ${i.pesoEmGrama}")
            }
        }

    }
}


class GraosClass(nome: String, pesoEmGrama: Double) : ProdutosPGramas(nome, pesoEmGrama) {
    var graosList = arrayListOf<GraosClass>()

    override fun cadastrarProduto() {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()) {
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()

                }

                if (!grama.contains('.') || grama.contains('-') || grama == "0") {

                    throw NumberFormatException()
                }

                graosList.add(GraosClass(nome, grama.toDouble()))

            } catch (exception: UnsupportedOperationException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")


            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para verdura, a quantidade deve ser informada com ponto")

            }

    }

    override fun mostrarValores() {
        println("-------LISTA DE GRÃOS-------")
        if (graosList.isEmpty()) {
            println("Você não comprou nenhum outros")
        } else {
            println("A quantidade a ser comprada de grãos é ${graosList.size}")
            for (i in graosList) {
                println("Nome: ${i.nome}    Peso em gramas: ${i.pesoEmGrama}")
            }
        }
    }

}

class LegumesClass(nome: String, pesoEmUnidade: Int) : ProdutosPUnidade(nome, pesoEmUnidade) {
    var legumesList = ArrayList<LegumesClass>()

    override fun cadastrarProduto() {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()) {
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade por unidade que deseja comprar:")
                var unidade = readln()
                if (unidade.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (unidade.contains('.') || unidade.contains(',') || unidade.contains('-') || unidade == "0") {
                    throw NumberFormatException()
                }

                legumesList.add(LegumesClass(nome, unidade.toInt()))

            } catch (exception: UnsupportedOperationException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Legumes, a quantidade deve ser informada em unidades inteiras.")

            }


    }

    override fun mostrarValores() {
        println("-------LISTA DE LEGUMES-------")
        if (legumesList.isEmpty()) {
            println("Você não comprou nenhum legume")
        } else {
            println("A quantidade a ser comprada de legumes é ${legumesList.size}")
            for (i in legumesList) {
                println("Nome: ${i.nome}    Peso em unidades: ${i.pesoEmUnidade}")
            }
        }
        }
    }




class OutrosClass(nome: String, pesoEmUnidade: Int) : ProdutosPUnidade(nome, pesoEmUnidade) {
    var outrosList = ArrayList<OutrosClass>()
    override fun cadastrarProduto() {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()) {
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade por unidade que deseja comprar:")
                var unidade = readln()
                if (unidade.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (unidade.contains('.') || unidade.contains(',') || unidade.contains('-') || unidade == "0") {
                    throw NumberFormatException()
                }

                outrosList.add(OutrosClass(nome, unidade.toInt()))

            } catch (exception: UnsupportedOperationException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            } catch (exception: NumberFormatException) {
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Outros, a quantidade deve ser informada em valor unitário.")

            }


    }

    override fun mostrarValores() {
        println("-------LISTA DE OUTROS-------")
        if (outrosList.isEmpty()) {
            println("Você não comprou nenhum outro item")
        } else {
            println("A quantidade a ser comprada de outros é ${outrosList.size}")
            for (i in outrosList) {
                println("Nome: ${i.nome}    Peso em unidades: ${i.pesoEmUnidade}")
            }
        }
    }

}


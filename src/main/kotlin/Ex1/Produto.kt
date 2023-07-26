package Ex1

class Produto {

    fun produtoMaisBarato(precosArray: Array<Double>): Double{
     val produtoBarato =  precosArray.min()
     return produtoBarato
    }
}
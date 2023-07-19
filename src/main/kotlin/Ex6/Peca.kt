package Ex6

abstract class Peca (var marca: String, var modelo: String) {
    abstract fun retirada()
}

class SaveTheRoupa( marca: String, modelo: String): Peca(marca, modelo){
    override fun retirada() {
    }

}
package Ex5

class Gato (nome: String, raca: String, dono: String): Animal(nome, raca, dono) {

    override fun movimentar() {
        super.movimentar()
        println("Andando e saltando em 4 patas. ")
    }

    override fun comer() {
        super.comer()
        println("Comendo whiskas sachê.")
    }

    override fun dormir() {
        super.dormir()
        println("Dormindo na caixa.")
    }


}
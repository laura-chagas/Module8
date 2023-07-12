package Ex5

class Peixe (nome: String, raca: String, dono: String): Animal(nome, raca, dono) {
    override fun movimentar() {
        super.movimentar()
        println("Nadando. ")
    }

    override fun comer() {
        super.comer()
        println("Comendo ração molhada.")
    }

    override fun dormir() {
        super.dormir()
        println("Dormindo de olho aberto.")
    }


}
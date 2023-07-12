package Ex5

class Cachorro (nome: String, raca: String, dono: String): Animal(nome, raca, dono) {
    override fun movimentar() {
        super.movimentar()
        println("Andando em 4 patas. ")
    }

    override fun comer() {
        super.comer()
        println("Comendo bife.")

    }
    override fun dormir() {
        super.dormir()
        println("Dormindo na cama da Jéssica.")
    }


}
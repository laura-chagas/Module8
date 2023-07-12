package Ex5

fun main() {
    val dog1 = Cachorro("Spike", "Pitbull", "Clint Clooper")
    dog1.movimentar()
    dog1.comer()
    dog1.dormir()
    dog1.exibirDetalhes()
    println("------------------------")

    val dog2 = Cachorro("Scooby Doo", "Labrador", "Salsicha")
    dog2.movimentar()
    dog2.comer()
    dog2.dormir()
    dog2.exibirDetalhes()
    println("------------------------")

    val cat1 = Gato("Tiana", "SRD", "Laura")
    cat1.movimentar()
    cat1.comer()
    cat1.dormir()
    cat1.exibirDetalhes()
    println("------------------------")

    val cat2 = Gato("Tom", "SRD", "Clint Clooper")
    cat2.movimentar()
    cat2.comer()
    cat2.dormir()
    cat2.exibirDetalhes()
    println("------------------------")

    val fish1 = Peixe("Batman", "Beta", "Felix")
    fish1.comer()
    fish1.movimentar()
    fish1.dormir()
    fish1.exibirDetalhes()
    println("------------------------")

    val fish2 = Peixe("Nemo", "Bagre", "Deise")
    fish2.comer()
    fish2.movimentar()
    fish2.dormir()
    fish2.exibirDetalhes()
    println("------------------------")
}
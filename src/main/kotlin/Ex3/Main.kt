package Ex3

fun main() {
    val dictionary = DictionaryClass()

   dictionary.addWord("Cadeira")
    dictionary.addWord("Mesa")
    dictionary.addWord("Livro")
    dictionary.addWord("Pneumoultramicroscopicossilicovulcanoconiótico")

    dictionary.showWords()

    dictionary.findWord("Escada")

    dictionary.findWord("Mesa")

   // Implementação extra...

    dictionary.addMeaningAndWord("Bola", "Objeto esférico utilizado na prática de esportes.")

    dictionary.findWordAndShowMeaning("Bola")
}
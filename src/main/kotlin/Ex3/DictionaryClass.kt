package Ex3

class DictionaryClass {
    private var dictionary = mutableListOf<String>()
    private var dictionary2 = mutableMapOf<String, String>()

    fun addWord(inputWord: String) {
        dictionary.add(inputWord)
    }

    fun addMeaningAndWord(inputWord: String, meaningInput: String){
        dictionary2[inputWord] = meaningInput
    }

    fun findWordAndShowMeaning(inputWord: String){
        println("Significado do termo $inputWord: "  + dictionary2.getValue(inputWord))
    }

    fun findWord(inputWord: String) {
        println("Buscando termo...")

        for (i in dictionary) {
            if (i.equals(inputWord, ignoreCase = true)) {

                println("Termo $inputWord foi encontrado!")
                println("-----------------")
                return
            }
        }

        println("Termo: $inputWord não foi encontrado! ")
        println("-----------------")
    }

    fun showWords() {
        println("-------DICIONARIO-------")
        for (i in dictionary.sorted()) {
            println(i)
        }
        println("------------------------")
    }
}


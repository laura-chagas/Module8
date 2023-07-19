package Ex3

class DictionaryClass {
    private var dictionaryList = mutableListOf<String>()
    private var dictionaryMap = mutableMapOf<String, String>()

    fun addWord(inputWord: String) {
        dictionaryList.add(inputWord)
    }

    fun addMeaningAndWord(inputWord: String, meaningInput: String){
        dictionaryMap[inputWord] = meaningInput
    }

    fun findWordAndShowMeaning(inputWord: String){
        println("Significado do termo $inputWord: "  + dictionaryMap.getValue(inputWord))
    }

    fun findWord(inputWord: String) {
        println("Buscando termo...")

        for (i in dictionaryList) {
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
        for (i in dictionaryList.sorted()) {
            println(i)
        }
        println("------------------------")
    }
}


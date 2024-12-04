package Strings

object Exercise2 {
    fun execution() {
        println("Introduce la cadena de texto")
        val words = readlnOrNull()
        if (words == null  || words == "") return
        println("palabra a sustituir")
        val rempalceWords = readlnOrNull()
        if (rempalceWords == null  || rempalceWords == "") return println("Result: $words")
        println("nueva palabra")
        val newWords = readlnOrNull()
        if (newWords == null  || newWords == "") return println("Result: $words")

        val mut = words.replace(rempalceWords, newWords)
        println("Result: $mut")

    }
}
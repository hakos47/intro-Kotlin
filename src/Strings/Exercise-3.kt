package Strings

object Exercise3 {
    fun execution() {
        println("Introduce la frase")
        var words = readlnOrNull()
        if (words == null  || words == "") return
        println("instroduce valor a reemplazar")
        val rempalceWord = readlnOrNull()
        if (rempalceWord == null || rempalceWord == "") return println("Result: $words")
        if (words.startsWith(rempalceWord)) {
            words = words.removePrefix(rempalceWord.toString())
        }

        if (words.endsWith(rempalceWord)) {
            words = words.removeSuffix(rempalceWord.toString())
        }

        println("\nResult: " +words +"\n")
    }
}
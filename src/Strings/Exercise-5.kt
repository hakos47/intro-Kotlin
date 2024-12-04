package Strings



object Exercise5 {
    fun checkStartEndMatch(words: String): Boolean {
        // If the words has less than 2 characters, it cannot meet the condition
        if (words.length < 2) {
            return false
        }
        // Extract the first two characters
        val firstTwo = words.substring(0, 2)
        // Extract the last two characters
        val lastTwo = words.substring(words.length - 2)
        // Check if the first two characters are the same as the last two
        return firstTwo == lastTwo
    }

    fun execution() {
        println("Introduce La cadena de texto")
        val words = readlnOrNull()
        if (words == null) return
        else if (words.length < 2) println("Result: false")
        else println("\nResult :" + checkStartEndMatch(words)+ "\n")

    }
}
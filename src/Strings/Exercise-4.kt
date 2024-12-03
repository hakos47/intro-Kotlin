package Strings

object Exercise4 {
    fun GetTwoFirstParam(words:String): String {
        if (words.length < 2) return words
        val value = words.substring(0, 2)
        return value
    }
    fun execution(){
        println("Introduce La cadena de texto")
        var words = readlnOrNull()
        if (words == null) return
        println("\nResult: ${GetTwoFirstParam(words).repeat(2)}\n")
    }
}
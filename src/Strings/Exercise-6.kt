package Strings

object Exercise6 {

    fun execution(){
        println("\n Introduce primera cadena:")
        val words = readlnOrNull()
        if (words == null) return
        println("Introduce segunda cadena:")
        val phaser = readlnOrNull()
        if (phaser == null) return
        println("Result: ${words.uppercase() == phaser.uppercase()}")
    }
}
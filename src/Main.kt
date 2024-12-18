//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP   1. Tipos de Datos

   // Enteros

    val integer: Int = 29
    val long: Long = 1000000000000L

    // Flotantes

    val float: Float = 3.14f
    val double: Double = 3.14159265000054343

    //Boolean

    var isFavorite: Boolean = true
    isFavorite = false

    // Characters (Char)

    val characterr: Char = '#'


    // Strings

    val regards: String = "Hola menu"

    // print console

    println("Entero: " + integer)
    println("isFavourite: " + isFavorite)
    println("regards: " + regards)

    //TIP 2. Bucles

    //  For(y sus derivados), while, DoWhile
    for(i in 1..5 step 2) {
        println("Value " + i)
    }

    var vA = 3
    var vB = 10

    while (vA <= vB) {
        vA++
        vA.inc()
        vA = vA+1
        vA+=1
        println("vA is $vA")
    }

    do {
        vA++
        println("Do while vA is $vA")
    } while (vA < vB)

    // 3. When (Cases) <- Switch

    val day = 3
    when(day) {
        1 -> println("Today is Monday")
        2 -> println("Yesterday is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("No es un dia valido")
    }

    //TIP sout auto complete println
   // println()
}
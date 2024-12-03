import java.lang.System.exit

fun menuNumbers() {
    println("\nQue ejercicios de Numeros quieres ejecutar?:")
    println("0. Return")
    println("1. Exercise 1")
    println("2. Exercise 2")
    println("3. Exercise 3")
    println("4. Exercise 4")
    println("5. Exercise 5")
    println("6. Exercise 6")
    println("7. Exercise 7")
    println("8. Exercise 8")

}

fun menuStrings() {
    println("\nQue ejercicios de Strings quieres ejecutar?:")
    println("0. Return")
    println("1. Exercise 1")
    println("2. Exercise 2")
    println("3. Exercise 3")
    println("4. Exercise 4")
    println("5. Exercise 5")
    println("6. Exercise 6")
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //TIP   1. Tipos de Datos

   // Enteros
/*
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
*/
    println("Select exercise Numbers")




    do {
        println("\n Selecciona el tipo de ejercicios (numbers/strings) o escribe 'exit' para salir:")
        val category = readLine()?.lowercase()

        if (category == "exit") break

        when (category) {
            "numbers", "strings" -> {
                do {
                    if (category == "strings") menuStrings()
                    else if (category == "numbers") menuNumbers()
                    val option = readLine()?.toIntOrNull()


                    when (option) {
                        1 -> if (category == "numbers") Numbers.Exercise1.execution() else Strings.Exercise1.execution()
                        2 -> if (category == "numbers") Numbers.Exercise2.execution() else Strings.Exercise2.execution()
                        3 -> if (category == "numbers") Numbers.Exercise3.execution() else Strings.Exercise3.execution()
                        4 -> if (category == "numbers") Numbers.Exercise4.execution()
                        5 -> if (category == "numbers") Numbers.Exercise5.execution()
                        6 -> if (category == "numbers") Numbers.Exercise6.execution()
                        7 -> if (category == "numbers") Numbers.Exercise7.execution()
                        8 -> if (category == "numbers") Numbers.Exercise8.execution()
                        0 -> break
                        else -> println("Opción inválida. Por favor, elige un número entre 1 y 8 o 0 para salir.")
                    }
                } while (option != 0)
            }
            else -> println("Categoría inválida. Por favor, escribe 'numbers', 'strings' o 'exit'.")
        }
    } while (category != "exit")
}



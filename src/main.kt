import ArrayAndObjets.*
import Numbers.*
import Strings.Exercise5
import Strings.Exercise6

fun menuNumbers() {
    println("\nQue ejercicios de Numeros quieres ejecutar?:")
    println("0. Return")
    println("1. Crea una función que dado 2 números enteros los sume y devuelva el resultado")
    println("2. Crea una función que dado 2 números enteros los multiplique y devuelva el resultado")
    println("3. Crea una función que dado 2 números enteros (dividendo y divisor) los divida y devuelva el resultado solo si el divisor no es 0 en caso contrario devuelve nulo")
    println("4. Crea una función que dado 2 números enteros los divida y devuelva la parte entera de la división. Si el divisor es 0 devuelve nulo")
    println("5. Crea una función que calcule el porcentaje de victorias de un equipo de futbol según los partidos que ha jugado y los que ha ganado")
    println("6. Crea una función que dados 2 números devuelva el de mayor valor")
    println("7. Calcula el volumen de una piscina dado el ancho, largo y la altura")
    println("8. Crea una función para calcular los X primeros números primos")

}

fun menuStrings() {
    println("\nQue ejercicios de Strings quieres ejecutar?:")
    println("0. Return")
    println("1. Crea una función que dados 2 strings los concatene y los devuelva")
    println("2. Crea una función que dada una frase sustituya un caracter por otro")
    println("3. Crea una función que dado una frase borre el caracter que se le pasa si la contiene al principio o al final de la frase")
    println("4. Crea una función que dado un texto devuelva 2 veces las 2 primeras letras. Ejemplo \"swift\" devuelve \"swsw\"")
    println("5. Crea una función que dada una frase compruebe que los 2 primeros caracteres son iguales que los 2 últimos")
    println("6. Comprueba que 2 textos son iguales independientemente de si son mayusculas o no")

}

fun menuArrays() {
    println("\nQue ejercicios de Arrays quieres ejecutar?:")
    println("0. Return")
    println("1. Crea una función que dado un array de números inserte un número en una posición designada. Devuelve el nuevo array o nil en caso de que no sea posible")
    println("2. Crea una función que dado un conjunto de enteros devuelva si existe un número dentro de él")
    println("3. Crea una función que dado un conjunto de enteros devuelva el número de veces que se repite un número dado")
    println("4. Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT")
    println("5. Crea una función que dado un conjunto de String añada un nuevo elemento que se le pase y devuelva el nuevo array")
    println("6. Crea una función que dado un conjunto de Int devuelva el primer número entre 1 y 1000000 que no se encuentre dentro del array")

}

fun menuObjects() {
    println("\nQue ejercicios de Objectos quieres ejecutar?:")
    println("0. Return")
    println("1. Crea las clases necesarias para definir clases y alumnos y añade. Crea 1 array con 2 clases con 10 alumnos cada una con valores de ejemplo")
    println("2. Imprime por consola todos los alumnos cuyo nombre contiene \"a\" en cada una de las clases")
    println("3. Añade un atributo nuevo a la clase que sea isApproved y otra que sea isProgressing e imprime todos los alumnos suspendidos que no esten progresando de cada clase")
    println("4. Añade un atributo nuevo a la clase que sea needHelp que sera true cuando isApproved e isProgressing sean false. Este atributo se debe autocalcular al iniciar la clase \n o cambiar el valor de isApproved o isProgressing a false e imprime todos los \n alumnos suspendidos de cada clase que necesitan ayuda ")
    println("5. Obten un array nuevo de alumnos suspendidos de todas las clases")
}

fun menuArraysAndObjects() {
    println("\nQue ejercicios de Objetos y arrays quieres ejecutar?:")
    println("0. Return")
    println("1. Crea las clases necesarias para definir clases y alumnos y añade. Crea 1 array con 2 clases con 10 alumnos cada una con valores de ejemplo")
    println("2. Imprime por consola todos los alumnos cuyo nombre contiene \"a\" en cada una de las clases")
    println("3. Añade un atributo nuevo a la clase que sea isApproved y otra que sea isProgressing e imprime todos los alumnos suspendidos que no esten progresando de cada clase")
    println("4. Añade un atributo nuevo a la clase que sea needHelp que sera true cuando isApproved e isProgressing sean false. Este atributo se debe autocalcular al iniciar la clase o cambiar el valor de isApproved o isProgressing a false e imprime todos los alumnos suspendidos de cada clase que necesitan ayuda ")
    println("5. Obten un array nuevo de alumnos suspendidos de todas las clases")
}

var numInst = Arrays.Numbers()
fun ExecArrays(exercise: Int) {
    println("numInst exercise=${numInst.numbers.isEmpty()}")
    if (numInst.numbers.isEmpty() && exercise != 5) {
        numInst.start(exercise)
    }
    if (numInst.stringsArray.isEmpty() && exercise == 5) {
        numInst.start(exercise)
    }
    var next: String = ""
    do {
        println("Continuar con el mismo arrays? y/n")
        next = readlnOrNull() ?: next

    } while (next != "y" && next != "n")
    if (next == "n") numInst.start(exercise)

    when (exercise) {
        1 -> numInst.exec1()
        2 -> numInst.exec2()
        3 -> numInst.exec3()
        4 -> numInst.exec4()
        5 -> numInst.exec5()
        6 -> numInst.exec6()
    }

}

fun ExecArraysAndObjects(option: Int) {
    println("Exec clas")
    when (option) {
        1 -> ClassExec1()
        2 -> ClassExec2()
        3 -> ClassExec3()
        4 -> ClassExec4()
        5 -> ClassExec5()

    }
}

fun ExecNumbers(option: Int) {
    when (option) {
        1 -> Exercise1.execution()
        2 -> Exercise2.execution()
        3 -> Exercise3.execution()
        4 -> Exercise4.execution()
        5 -> Numbers.Exercise5.execution()
        6 -> Numbers.Exercise6.execution()
        7 -> Exercise7.execution()
        8 -> Exercise8.execution()
        else -> println("\n Opcion no valida\n")
    }

}

fun ExecStrings(option: Int) {
    when (option) {
        1 -> Strings.Exercise1.execution()
        2 -> Strings.Exercise2.execution()
        3 -> Strings.Exercise3.execution()
        4 -> Strings.Exercise4.execution()
        5 -> Exercise5.execution()
        6 -> Exercise6.execution()
        else -> println("\n Opcion no valida\n")
    }
}
fun FilterExercise(category: String, option: Int?) {
    if (option == 0) return
    when (category) {
        "arrays" -> ExecArrays(option ?: 0)
        "arraysAndObjects" -> ExecArraysAndObjects(option ?: 0)
        "numbers" -> ExecNumbers(option ?: 0)
        "strings" -> ExecStrings(option ?: 0)
    }
}

fun ShowMenuSelection(category: String):Int {
    when (category) {
        "strings" -> {
            menuStrings()
            return 1
        }
        "numbers" -> {
            menuNumbers()
            return 1
        }
        "arrays" -> {
            menuArrays()
            return 1
        }
        "arraysAndObjects" -> {
            menuArraysAndObjects()
            return 1
        }
        "objects" -> {
            menuObjects()
            return 1
        }
        else ->  return -1
    }

}

fun InitMenuGetCaregory(): String {
    println("\n Selecciona el tipo de ejercicios (numbers/strings/arrays/arraysAndObjects) o escribe 'exit' para salir:")
    val category = readlnOrNull()
    if (category.isNullOrBlank()) return "none"
    return category
}

fun main() {
    do {
        val category = InitMenuGetCaregory()
        do {
            val success = ShowMenuSelection(category)
            if (success == -1) {
                println("Categoria invalida!!")
                break
            }
            val option = readlnOrNull()?.toIntOrNull() ?: break
            FilterExercise(category, option)
        } while (option != 0)

    } while (category != "exit")
}



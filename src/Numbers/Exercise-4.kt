package Numbers

object Exercise4 {
    // Función que realiza la división y devuelve null si el divisor es 0
    fun safeDivision(dividendo: Int, divisor: Int): Double? {
        return if (divisor != 0) {
            dividendo.toDouble() / divisor
        } else {
            null
        }
    }

    fun execution() {
        println("Exercise 4: División segura")

        println("Ingrese el dividendo:")
        val dividendo = readLine()?.toIntOrNull()

        println("Ingrese el divisor:")
        val divisor = readLine()?.toIntOrNull()

        if (dividendo != null && divisor != null) {
            val result = safeDivision(dividendo, divisor)
            if (result != null) {

                println("Resultado: ${result.toInt()}")
            } else {
                println("División no válida: el divisor no puede ser 0.")
            }
        } else {
            println("Entrada inválida. Asegúrese de ingresar números enteros.")
        }
    }
}

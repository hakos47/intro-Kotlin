class Arrays {
    class Numbers {
        var numbers = emptyArray<Int>()

        fun start() {
            println("Introduce los numeros para el array separado por espacios:")
            val inputArray = readlnOrNull()
            if (inputArray.isNullOrEmpty()) {
                return println("Array vacío")
            }

            val result = inputArray.split(" ")
                .mapNotNull { it.toIntOrNull() }

            if (result.isEmpty()) {
                return println("Array vacío o contiene valores no numéricos")
            }

            this.numbers = result.toTypedArray()
            println("Array initialization: ${this.numbers.joinToString(", ")}")
        }

        fun exec1() {
            println("Introduce la posicion y el numero que quieres insertar:")
            val inputArray = readlnOrNull()
            if (inputArray.isNullOrEmpty()) return println("Secuencia no valida formato: <position> <number>")
            var newArray = inputArray.split(" ").mapNotNull { it.toIntOrNull() }
            var position = newArray[0] - 1
            if (position < 0 ) position = 0
            val number = newArray[1]
            this.numbers[position] = number

            println("Nuevo Array guardado : ${this.numbers.joinToString(", ")}")


        }
    }
}

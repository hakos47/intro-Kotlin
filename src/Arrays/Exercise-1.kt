class Arrays {
    class Numbers {
        var numbers = emptyArray<Int>()
        var stringsArray: MutableList<String> = mutableListOf()

        fun start(exercise: Int) {
            println("Introduce los numeros, o los strings, para el array separado por espacios:")
            val inputArray = readlnOrNull()
            if (inputArray.isNullOrEmpty()) {
                return println("Array vacío")
            }
            if (exercise == 5) {
                val result = inputArray.split(" ").map { it.trim() }.filter { it.isNotEmpty() }
                this.stringsArray.clear()
                this.stringsArray.addAll(result)

                println("Array initialization: ${this.stringsArray.joinToString(", ")}")

            } else {
                val result = inputArray.split(" ")
                    .mapNotNull { it.toIntOrNull() }

                if (result.isEmpty()) {
                    return println("Array vacío o contiene valores no numéricos")
                }

                this.numbers = result.toTypedArray()
                println("Array initialization: ${this.numbers.joinToString(", ")}")
            }

        }

        fun exec1() {
            println("Introduce la posicion y el numero que quieres insertar:")
            val inputArray = readlnOrNull()
            if (inputArray.isNullOrEmpty()) return println("Secuencia no valida formato: <position> <number>")
            var newArray = inputArray.split(" ").map { it.toInt() }
            var position = newArray[0] - 1
            if (position < 0 ) position = 0
            val number = newArray[1]
            this.numbers[position] = number

            println("Nuevo Array guardado : ${this.numbers.joinToString(", ")}")


        }
    }
}

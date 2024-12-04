fun Arrays.Numbers.exec5() {
    println("Introduce la cadena a añadir:")
    val inputText = readlnOrNull()?.takeIf { it.isNotBlank() }  ?: return println("\n No hay datos validos \n")
    this.stringsArray.add(inputText)
    println("Cadena Insertada : ${this.stringsArray.joinToString(", ")}")
}
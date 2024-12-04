fun Arrays.Numbers.exec2() {
    println("Introduce El numero a comprobar:")
    val numberCheck = readLine()?.toIntOrNull() ?: return
    val result = this.numbers.any{ (it == numberCheck) }

    println("El numero $numberCheck esta en el array?: ${result}")

}
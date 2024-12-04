fun Arrays.Numbers.exec3() {
    println("Introduce El numero a comprobar:")
    val numberCheck = readLine()?.toIntOrNull() ?: return
    var count = this.numbers.count { it == numberCheck }
    println("El numero $numberCheck aparece $count veces en el array")
}
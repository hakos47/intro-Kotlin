package Numbers

object Exercise5 {
    fun calcPercent(v1: Int, v2: Int): Int {
        if (v1 == 0 || v2 == 0) return 0
        return ((v2 * 100) / v1).toInt()

    }

    fun execution() {
        println("Exercise 5: Calcular por centaje")
        println("numbero de partidos")
        val games: Int = readLine()?.toIntOrNull() ?: 0
        println("numero de victorias")
        val wins: Int = readLine()?.toIntOrNull() ?: 0
        var result: Int = calcPercent(games, wins  )
        print("El porcentaje de victorais es : $result %")


    }
}

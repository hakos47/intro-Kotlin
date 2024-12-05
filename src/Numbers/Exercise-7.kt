package Numbers

object Exercise7 {
    fun volume(width: Int, long: Int, height: Int): Int {
        return width * long * height

    }

    fun execution() {
        println("Exercise 7")
        println("Introduce el ancho")
        val width = readLine()?.toInt() ?: 0
        println("Introduce el largo")
        val long = readLine()?.toInt() ?: 0
        println("Introduce el Alto")
        val height = readLine()?.toInt() ?: 0
        var result: Int = volume(width, long, height)

        println("Volumen $result m3")
        var litres: Int = result * 1000
        println ("litros $litres")

    }
}
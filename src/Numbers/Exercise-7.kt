package Numbers

object Exercise7 {
    fun volume(width: Int, long: Int, height: Int): Int {
        return width * long * height

    }

    fun execution() {
        println("Exercise 7")
        println("Introduce el ancho")
        val width = readLine()!!.toInt()
        println("Introduce el largo")
        val long = readLine()!!.toLong()
        println("Introduce el Alto")
        val height = readLine()!!.toInt()
        var result: Int = volume(width, height, height)

        println("Volumen $result m3")
        var litres: Int = result * 1000
        println ("litros $litres")

    }
}
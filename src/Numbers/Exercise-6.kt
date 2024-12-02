package Numbers

object Exercise6 {
    fun numberIsGreater(v1: Int, v2: Int) :Int {
        if (v1 >= v2) {
            return v1
        }
        return v2
    }
    fun execution() {
        println("Exercise 6")
        val number1 = readLine()?.toIntOrNull() ?: 0
        val number2 = readLine()?.toIntOrNull() ?: 0

        var result = numberIsGreater(number1, number2)
        println("El mayor numbero es $result")

    }
}
package Numbers

object Exercise1 {
    fun Suma(v1:Int,v2:Int):Int {
        return v1+v2
    }
    fun execution() {
        println("Exercise 1")
        print("Valor 1")
        val v1: Int = readLine()?.toInt() ?: 0
        println("Valor 2: $v1")
        val v2:Int = readLine()?.toInt()  ?: 0
        println("Suma $v1 + $v2")
        var result = Suma(v1,v2)
        print("Result: " + result)

    }
}
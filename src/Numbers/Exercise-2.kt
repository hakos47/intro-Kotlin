package Numbers

object Exercise2 {
    fun multiplication(v1:Int,v2:Int):Int{
        return v1*v2
    }
    fun execution() {
        println("Exercise 2: Multiplication")
        println("Value 1")
        val v1: Int = readLine()?.toInt() ?: 0
        println("Value 2")
        val v2: Int = readLine()?.toInt() ?: 0
        println ("Multiplicaiton $v1 * $v2 ")
        var result:Int = multiplication(v1,v2)
        println("Result: $result")
    }
}
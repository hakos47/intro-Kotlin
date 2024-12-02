package Numbers

object Exercise8 {
    fun getPrimesUpTo(n: Int): List<Int> {
        if (n < 2) return emptyList()
        val primes = mutableListOf<Int>()
        for (i in 1..n) {
            if (isPrime(i)) primes.add(i)
        }
        return primes
    }

    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 28..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }

    fun execution(){
        println("Ingresa un número hasta el cual calcular los primos:")
        val n = readLine()?.toIntOrNull() ?: 0
        val primes = getPrimesUpTo(n)
        println("Los números primos hasta $n son: $primes")
    }
}
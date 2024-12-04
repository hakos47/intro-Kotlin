fun CheckArrayNumber(num: Int, numbers: Array<Int>): Int {
    if (num > 1000000 ) return -1
    for (i in 1..numbers.size) {
        if (numbers[i-1].toInt() == num.toInt()) {
            return CheckArrayNumber(num + 1, numbers)
        }
    }
    return num
}

fun Arrays.Numbers.exec6() {
    val result = CheckArrayNumber(1, this.numbers)
    if (result == -1) {
        println("Sobrepasado limite maximo")

    } else {
        println("\n Result: " + result)
    }
}
fun customSort(array: IntArray):IntArray {
    if (array.size <= 1) return array
    val pivot = array[0]
    val less = array.filter { it < pivot }.toIntArray()
    val equal = array.filter { it == pivot }.toIntArray()
    val greater = array.filter { it > pivot }.toIntArray()
    return customSort(less) + equal + customSort(greater)
}

fun Arrays.Numbers.exec4() {
    val sortedArray = customSort(this.numbers.toIntArray())
    println("\n Array ordenada: ${sortedArray.joinToString(", ")}")

}
package SectionC

fun main() {
    val numbers = listOf(10, 20, 10, 30, 20, 40)
    val uniqueNumbers = numbers.distinct()

    println(uniqueNumbers) // Output: [10, 20, 30, 40]
}

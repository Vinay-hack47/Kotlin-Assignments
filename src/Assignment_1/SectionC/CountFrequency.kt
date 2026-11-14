package Assignment_1.SectionC

fun main() {
    val items = listOf("apple", "banana", "apple", "orange", "banana", "apple")
    val frequencyMap = items.groupingBy { it }.eachCount()

    println(frequencyMap) // Output: {apple=3, banana=2, orange=1}
}

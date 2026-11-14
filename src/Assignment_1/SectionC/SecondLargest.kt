package Assignment_1.SectionC

fun main() {
    val numbers = listOf(12, 35, 1, 10, 34, 35)

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in numbers) {
        if (num > largest) {
            secondLargest = largest
            largest = num
        } else if (num > secondLargest && num != largest) {
            secondLargest = num
        }
    }

    if (secondLargest == Int.MIN_VALUE) {
        println("No second largest element exists.")
    } else {
        println("Second largest element: $secondLargest") // Output: 34
    }
}

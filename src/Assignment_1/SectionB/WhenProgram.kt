package Assignment_1.SectionB

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    while (true) {
        println("\n=== Math Operations Menu ===")
        println("1. Addition (+)")
        println("2. Subtraction (-)")
        println("3. Multiplication (*)")
        println("4. Division (/)")
        println("5. Power (a^b)")
        println("6. Square Root (√a)")
        println("7. Exit")
        print("Enter your choice (1-7): ")

        val choice = readln().toIntOrNull()

        if (choice == 7) {
            println("Exiting program. Goodbye!")
            break
        }

        when (choice) {
            1 -> {
                val (a, b) = readTwoNumbers()
                println("Result: ${a + b}")
            }
            2 -> {
                val (a, b) = readTwoNumbers()
                println("Result: ${a - b}")
            }
            3 -> {
                val (a, b) = readTwoNumbers()
                println("Result: ${a * b}")
            }
            4 -> {
                val (a, b) = readTwoNumbers()
                if (b == 0.0) {
                    println("Error: Cannot divide by zero.")
                } else {
                    println("Result: ${a / b}")
                }
            }
            5 -> {
                val (a, b) = readTwoNumbers()
                println("Result: ${a.pow(b)}")
            }
            6 -> {
                print("Enter a number: ")
                val a = readln().toDouble()
                if (a < 0) {
                    println("Error: Cannot find square root of a negative number.")
                } else {
                    println("Result: ${sqrt(a)}")
                }
            }
            else -> println("Invalid choice! Please enter a number between 1 and 7.")
        }
    }
}

fun readTwoNumbers(): Pair<Double, Double> {
    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()
    return Pair(a, b)
}

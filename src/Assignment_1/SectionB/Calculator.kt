package Assignment_1.SectionB

fun main() {
    print("Enter first number: ")
    val num1 = readln().toDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = readln()

    print("Enter second number: ")
    val num2 = readln().toDouble()

    val result = when (operator) {
        "+" -> add(num1, num2)
        "-" -> subtract(num1, num2)
        "*" -> multiply(num1, num2)
        "/" -> {
            if (num2 == 0.0) {
                println("Error: Cannot divide by zero.")
                return
            }
            divide(num1, num2)
        }
        else -> {
            println("Error: Invalid operator.")
            return
        }
    }

    println("Result: $num1 $operator $num2 = $result")
}

fun add(a: Double, b: Double): Double = a + b

fun subtract(a: Double, b: Double): Double = a - b

fun multiply(a: Double, b: Double): Double = a * b

fun divide(a: Double, b: Double): Double = a / b

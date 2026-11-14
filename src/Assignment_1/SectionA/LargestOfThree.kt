package Assignment_1.SectionA

fun findLargest(num1 : Int, num2 : Int, num3 : Int) : Int{
    val largest = when{
        num1 >= num2 && num1 >= num3 -> num1
        num2 >= num3 -> num2
        else -> num3
    }
    return largest
}

fun main(){
    val (num1, num2, num3) = readln().split(' ').map { it.toInt() }
    print(findLargest(num1, num2, num3))
}
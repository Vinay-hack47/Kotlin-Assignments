package SectionA

fun main(){
    print("Enter the number : ")
    val num = readln()
    tableOfNumber(num.toInt())
}

fun tableOfNumber(num : Int){
    for (i in 1..10){
        println("$num * $i = ${num*i}")
    }
}
package Assignment_1.SectionA

fun checkEvenOrOdd(num : Int){
    if (num % 2 == 0){
        println("$num is even")
    }else{
        println("$num is odd")
    }
}

fun main(){
    print("Enter the number")
    val num = readln()
    checkEvenOrOdd(num.toInt())
}
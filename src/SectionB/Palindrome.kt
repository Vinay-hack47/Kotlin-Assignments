package SectionB

fun main(){
    print("Enter the number: ")
    val num = readln().toInt()
    println(checkPalindrome(num))
}

fun checkPalindrome(num : Int) : String{
    val obtainNum = reverseNumber(num)
    if (num == obtainNum){
        return "Number is palindrome"
    }
    return "Number is not palindrome"
}

// 1331
fun reverseNumber(num : Int) : Int{
    var revNum = 0
    var num = num
    while (num > 0){
        val lastDigit = num % 10
        revNum = (revNum *10) + lastDigit
        num /= 10
    }
    return revNum
}
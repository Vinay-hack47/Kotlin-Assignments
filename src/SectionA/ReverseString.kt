package SectionA

fun main(){
    val str = readln()
    println(reversString(str))
}

fun reversString(str : String) : String{
    var revStr = ""
    val n = str.length - 1

    for (i in n downTo 0){
        revStr += str[i]
    }
    return revStr
}
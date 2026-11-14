package SectionA

fun checkVowels(str : String) : Int{
    val vowels = "a,e,i,o,u"
    var count = 0

    for (i in str){
        if (i in vowels){
            count++
        }
    }

    return count
}

fun main(){
    println(checkVowels("vinay"))
}
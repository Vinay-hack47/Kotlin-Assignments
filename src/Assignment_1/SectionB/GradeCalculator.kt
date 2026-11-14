package Assignment_1.SectionB

fun main(){
    print("Enter the marks to obtain grade: ")
    val marks = readln().toInt()
    print(gradeCalculator(marks))
}

fun gradeCalculator(marks : Int) : String{
    val grade = when(marks){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59 -> "E"
        in 33..49 -> "F"
        else -> "Enter the valid marks"
    }

    return grade
}
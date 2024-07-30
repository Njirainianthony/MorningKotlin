import java.util.Scanner

fun main() {
    var read=Scanner(System.`in`)

    println("Enter number: ")
    var num1=read.nextDouble()

    println("Enter operator")
    var operator= read.next().single()

    println("Enter another number")
    var num2=read.nextDouble()

    when(operator){
        '+' -> println(num2+num1)
        '-' -> println(num1-num2)
        '*' -> println(num1*num2)
        '/' -> println(num1/num2)
        '%' -> println(num1%num2)

        else -> println("Invalid operator")
    }


}
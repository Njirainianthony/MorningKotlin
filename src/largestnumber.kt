import java.util.Scanner

fun main() {
    var read=Scanner(System.`in`)

    println("Enter 1st number")
    var num=read.nextDouble()

    println("Enter 2nd number")
    var num2=read.nextDouble()


    if(num>num2){
        println("$num is the largest number")
    }
    else if(num2>num){
        println("$num2 is the largest number")
    }
    else{
        print("They are equal")
    }


}
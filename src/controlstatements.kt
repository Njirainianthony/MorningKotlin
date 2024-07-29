import java.util.Scanner

fun main() {
    var read=Scanner(System.`in`)

    println("Enter temperature")
    var temp=read.nextDouble()

    if(temp>37.0){
        println("High fever")
    }
    else if(temp<37.0){
        println("Low fever")
    }
    else{
        println("Normal temperature")
    }

}
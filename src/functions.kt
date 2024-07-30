//USER-DEFINED FUNCTIONS

fun day(){
    println("Today is tuesday")
}

fun add(){
    var num1=56
    var num2=45

    println(num1+num2)
}


//PARAMETERS AND ARGUMENTS
fun student(name:String, age:Int){
    println("$name is $age years old")

}



fun main() {

    //PRE-DEFINED FUNCTIONS

    println("Anthony")
    var num=Math.sqrt(81.0)
    println("The squareroot is $num")

    var num2=Math.round(32.98)
    println("The result is $num2")

    var num3=Math.ceil(23.09)
    println("The number is $num3")

    var num4=Math.floor(76.99)
    println("The output is $num4")

    day()
    add()

    student("Anthony", 18)
    student("Gift", 78)
    student("Patrick", 88)
    student("Clarence", 188)




}
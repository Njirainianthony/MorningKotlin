fun main() {
    var firstname="Anthony"
    var lastname="Njiraini"

    println(firstname)
    println(firstname[1])//Print the second letter of the first name

    println(lastname.uppercase())//UPPERCASE
    println(lastname.lowercase())//LOWERCASE


    //STRING CONCATENATION

    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

    //STRING INTERPOLATION

    println("My name is "+firstname+" "+lastname)
    println("My name is $firstname $lastname")

    var num8=87
    var num9=78
    var result=num8+num9

    println("The sum of $num8 and $num9 is $result")






}
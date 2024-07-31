class person{

    // PROPERTIES/ATTRIBUTES/CHARACTERISTICS
    var name="John"
    var age=98

    // METHOD/FUNCTION/BEHAVIOUR

    fun sound(){
        println("Person is sleeping")
    }
}

fun main() {
    var teacher=person()
    println(teacher.age)
    println(teacher.name)

    var student=person()
    var accountant=person()
    teacher.sound()
    student.sound()
    accountant.sound()
}
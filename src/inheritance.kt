
//PARENT CLASS
open class animal{

    var gender="male"
    var age=2
    var hasfeathers=true

    fun sound(){
        println("Animal is speaking")
    }

}

open class duck:animal(){


    fun move(){
        println("Duck is swimming")
    }

}

class bird:duck(){
    var hasscales=true
    fun movement(){
        println("Bird is flying")
    }

}

fun main() {
    var a=animal()


    var b=duck()
    println(b.gender)
    println(b.hasfeathers)
    println(b.age)

    var c=bird()
    println(c.hasfeathers)
    println(c.age)
    println(c.hasscales)
    println(c.gender)

    c.move()
    c.movement()




}
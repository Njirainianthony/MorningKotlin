//PARENT CLASS

open class shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//CHILD CLASSES
class rectangle:shape(){
    override fun draw(){
        println("Drawing  a rectangle")
    }
}

class circle:shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}

fun main() {
    var myshape=shape()
    var mycircle=circle()
    var myrectangle=rectangle()

    myrectangle.draw()
    myshape.draw()
    mycircle.draw()

}
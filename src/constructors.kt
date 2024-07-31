class dog(var name:String, var breed:String, var age:Int){



}

fun main() {
    var dog1=dog("Isaac","German shepherd", 2)
    var dog2=dog("Clarence","Mutina", 5)
    var dog3=dog("Chris","Retriever", 6)

    println( dog1.name+" "+ dog1.breed+ " "+dog1.age)
    println(dog2.name+" "+ dog2.breed+ " "+dog2.age )
    println(dog3.name+" "+ dog3.breed+ " "+dog3.age)

}
fun main() {
    var languages= arrayOf("Kotlin","Python","Java")

    println(languages[1])


//REASSIGNING A VALUE IN AN ARRAY
    languages[1]="C++"
    println(languages[1])



    //ADDING A NEW ELEMENT IN AN ARRAY
    var all=languages.plus("PHP")
    for (lang in all){
        println(lang)
    }


    //DETERMINING SIZE OF AN ARRAY

    println(all.size)



}
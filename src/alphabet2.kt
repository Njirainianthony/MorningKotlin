import java.util.Scanner

fun main() {
    var read=Scanner(System.`in`)

    println("Please enter a letter")
    var letter=read.next().single()

   if (letter.isLetter() && letter!=null){
       if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
           println("$letter is a vowel")
       }

       else{
           println("$letter is a consonant")
       }
   }
    else{
        println("Please enter a valid input")
   }
}
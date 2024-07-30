fun main() {

    for (num in 1..5){
        println(num)
    }


    for (letter in 'a'..'f')
    {
        println("letter $letter")
    }

        //BREAK

    for(x in 20..25){
        if (x==23){
            break
        }
        println(x)
    }

        //CONTINUE

    for (y in 25..30){
        if (y==27){
            continue
        }
        println(y)

    }


    for (myletter in 'a'..'d'){
        if (myletter=='b'){
            continue
        }
        println(myletter)
    }




}
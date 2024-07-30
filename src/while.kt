fun main() {

    //WHILE

    var num=35
    while (num<=40){
        println(num)
        num++
    }

    var num2=10
    while(num2>=5){
        println(num2)
        num2--
    }


    //BREAK AND CONTINUE

    //BREAK
    var count=100
    while (count<=105){
        println("Count is $count")
        count++
        if(count==103){
            break
        }
    }

    //CONTINUE
    var x=25
    while (x<=30){
        if(x==27){
            x++
            continue
        }
        println(x)
        x++

    }




}
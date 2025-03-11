fun main() {
    for (i in 1..20) {
        println("Hello number $i") 
    }

    var factorial = 1 
    for (number in 5 downTo 1) {  // It is best for calculating factorial. 
        factorial *= number 
    }
    println(factorial) 

    var sum = 0 
    for (i in 10 until 100 step 3) {  // Skips 100 and iterate over every 3 number. 
        sum += i 
    }
    println("Sum = $sum") 


    // 💙 When a programmer falls in love... 💙
    // I decided to propose via code because, well, logic always works, right? 😎
    
    println("I said: I love You")  
    print("Press anything to see her Response: ")  
    val press1 = readln()  
    println("She said: I love You too")  
    print("Press anything to see my Response: ")  
    val press2 = readln()  
    println("I instantly replied: ")  
    println("I love you Three")  
    println("I love you Three")  
    println("I love you Three")  

    print("Press anything to see her Response: ")  
    val press3 = readln()  
    println("She took long but replied: ")  
    repeat(10) { println("I love you Ten") }  

    print("Press anything to see my Response: ")  
    val press4 = readln()  

    println("I replied with full power: ")  
    while (true) {  
        println("I love you Infinite")  
    }  

// See, she never replied back… probably because her system crashed. 😅💔  

}
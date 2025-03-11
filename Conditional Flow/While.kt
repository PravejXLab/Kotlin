fun main() {
    // Printing nubers from 10 to 1
    var num = 10  // var will be used because value of variable is changing. 
    while (num > 0) {  // It checks the condition and if true then runs. 
        println(num)  // If this function will be out of the loop, it will run once, thus printing 1. 
        num--  // This syntax is decreasing the value of num on each run. 
    }


    // Printing the sum of first 100 natural numbers skipping multiple of 7
    var toAdd = 1 
    var result = 0 
    do {  // This must run the loops atleast once because it first runs then check the condition. 
        if (toAdd % 7 == 0) {
            toAdd++
            continue  // It skips the numbers as said in condition.  
        }
        result += toAdd     
        toAdd++
    } while (toAdd <= 100)
    println("Sum of first 100 Natural numbers = $result") 


    // Infinite loop 
    var value = 0  
    while (value >= 0) { // This condition is always true so it will run upto infinity. 
        println(value)  // This will heat your pc, Stay careful!
        value ++ 
        if (value == 1000) { 
            break  // This syntax will stop the loop at 999, this problem will be solved. 
        }
    }
}

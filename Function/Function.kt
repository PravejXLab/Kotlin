fun greet(name: String): String {  // fun is function used to avoid repetation.  
    return "Hello $name!"  // Creat once call many time anywhere. 
} 

fun sum(num1: Int, num2: Int): Int {  
    return num1 + num2 
} 

fun optimGreet(names: String) = "Its my Research Lab: $names"  // Optimized version of greet fun. 
fun remainder(divident: Int, divisor: Int) = (divident % divisor == 0)  // Return Boolean
fun maxValue(val1: Int, val2: Int) = if (val1 > val2) val1 else if (val1 < val2) val2 else "Both are equal." 
fun even(evenNum: Int) = (evenNum % 2 == 0)  // Its Boolean, if even prints true else false. 
fun aboutMe(name: String, age: Int = 18) = "Hello $name, you are $age years old but no worry, Old is gold 😀."  

fun main() {
    println(greet("Pravej")) 
    println("Sum of two numbers = ${sum(5, 10)}") 
    println(optimGreet("PravejXLab")) 
    println(remainder(12, 3))  // Order matters if we are skipping parameters name, but not in aboutMe function.
    println(maxValue(28, 28)) 
    println(even(35)) 
    println(aboutMe(age = 100, name = "Pravej"))  // If we skip age, it will take 18 as we have assigned default argument. 

    print("Enter first number: ")
    val numA = getValidDouble() 
    print("Enter second number: ")
    val numB = getValidDouble() 
    print("Enter Operation: +, -, *, /: ") 
    val operator = readlnOrNull() ?: ""
    try {  // This is a program used to handle errors. 
        println(calculate(numA, numB, operator))  // It tries to executes this block first. 
    } catch (e : IllegalArgumentException) {  // If error catches, it passes to next logic. 
        println(e.message)  // message takes message from calculate function and e represents error. 
    }
    }
    


// A Project on this concept 

fun getValidDouble(): Double {
    while (true) {  // Infinite loop, it will ask user to enter valid double unless his entry is valid. 
        val input = readlnOrNull()?.toDoubleOrNull()  
        if (input != null) return input 
        print("Invalid Input, Try again: ")
    }
}

fun calculate(numA: Double, numB: Double, operation: String): Double { 
    when (operation) {
        "+" -> return numA + numB 
        "-" -> return numA - numB 
        "*" -> return numA * numB  
        "/" -> if (numB != 0.0) return (numA / numB) else throw IllegalArgumentException("Can't divide by Zero!")  
        else -> throw IllegalArgumentException("Invalid Entry!")
    }
}
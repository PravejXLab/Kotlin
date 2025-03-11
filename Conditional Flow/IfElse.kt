fun main() {
    // If else Condition --

    val rank = 2  
    if (rank <= 3 && rank > 0) {  // && ensure both conditions must be true. 
        println("You are under toppers") 
    } else if (rank >= 3) {  // If code has just two logics, this syntax will be ignored. 
        println("Sorry! Try again, Next time") 
    } else {
        println("Invalid Entry")
    }


    print("What is girls Age: ")
    val girlAge = readlnOrNull()?.toIntOrNull() 
    val canMarry = if (girlAge != null) {  // || ensures any of the arguments to be true. 
        if (girlAge > 18 || girlAge == 18) {  // It can also be written as: (girlAge >= 18)
            "Girl can marry!" 
        } else {
            "Girl cannot marry!" 
        }
    } else {
        "Invalid Entry!" 
    }
    println(canMarry) 


    print("Enter first number: ")
    val num1 = readlnOrNull()?.toDoubleOrNull() ?: 0  
    print("Enter second Number: ")    
    val num2 = readlnOrNull()?.toDoubleOrNull() ?: 0   
    val num3 = num1.toDouble() + num2.toDouble()    
    val check = if (num3 > 0) "Numbers might be Positive" else "Either of the numbers are000 negative or Zero" 
    println(check)  // This is single line condition assignment. 


    print("Please enter first number: ")
    val num4 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Please enter second number: ")
    val num5 = readlnOrNull()?.toIntOrNull() ?: 0
    val truth = (num5 > num4)  // This will return boolean either true or false. 
    if (truth) {
        println("Secdond number is greater than first number") 
    } else {
        println("First number is greater than second number") 
    }

}
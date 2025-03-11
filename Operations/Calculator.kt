fun main() {
    println("Enter 1 for '+' addition") 
    println("Enter 2 for '-' subtraction") 
    println("Enter 3 for '*' multiplication") 
    println("Enter 4 for '/' division")    
    println("Enter 5 for \"Remainder\" ")
    println("Enter 6 for \"Exponential\" ")  // This allows us to use "" inside ""
    println("""Enter 7 for "Percentage" """)  // We can also use this method for same purpose. 
    print("Choose Operation you like to perform: ") 
    val input = readlnOrNull()?.toIntOrNull() 


    if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5) {
        print("Enter First Number: ")
        val num1 = readlnOrNull()?.toIntOrNull() ?: 0
        print("Enter Second Number: ")
        val num2 = readlnOrNull()?.toIntOrNull() ?: 0

        when(input) {
            1 -> println("Sum: ${num1 + num2}") 
            2 -> println("Subtract: ${num1 - num2}") 
            3 -> println("Product: ${num1 * num2}") 
            4 -> if (num2 != 0) {
                println("Quotient: ${num1 / num2}") 
            } else {println("Cannot divide by Zero")}
            5 -> if (num2 != 0) {
                println("Remainder: ${num1 % num2}")  
            } else {println("Cannot divide by Zero")}
        }
    } else if (input == 6) { 
        var count = 1 
        print("Enter base number: ") 
        var base = readlnOrNull()?.toIntOrNull() ?: 0
        print("Enter exponent number: ")
        var exponent = readlnOrNull()?.toIntOrNull() ?: 0 
        var result = base  

        if (base == 0 && exponent == 0) {
            println("Not defined!") 
        } else {
            while (count < exponent) {
                result *= base 
                ++count  
            }
            println("$base^$exponent = $result")
        }

    } else if (input == 7) {
        print("Enter total value: ") 
        val total = readlnOrNull()?.toIntOrNull() ?: 1
        print("Enter original value: ")
        val original = readlnOrNull()?.toIntOrNull() ?: 0 
        if (total != 0) {
            val calculate = ((original.toDouble()) / (total.toDouble())) * 100
            val formatCalculate = "%.2f".format(calculate) 
            println("Percentage = $formatCalculate%")   // It format to limit decimal place. 
        } else {
            println("Total value cannot be Zero.")   
        } 

    } else {
        println("Invalid operation!") 
    }

}
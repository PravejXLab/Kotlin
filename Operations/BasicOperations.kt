import kotlin.math.pow  // This import will allow us to calculate power directly. 

fun main() {
    val num1 = 37 
    val num2 = 5 

    val sum = num1 + num2  // num1 and num2 are operands here. 
    val subtraction = num1 - num2  // 37 and 5 are literal values. 
    val product = num1 * num2  // +, -, *, /, % etc. are operators which perform opearations. 
    val quotient = (num1.toDouble()) / (num2.toDouble())   // This conversion is needed because variable is integer by default.  
    val remainder = num1 % num2  // This operator is used to find remainder not percentage. 
    println("Sum: $sum, subtraction: $subtraction, product: $product, Quotient: $quotient, Remainder: $remainder")    


    // There are two ways to calculate power. 

    // Using Loops - various methods not just while loop. 

    var count = 1  
    var power = 2  // Its value will be changing -- power = 4, 8, 16, 32. 
    while (count < 5) {  // This loop will execute four times -- count = 1, 2, 3 & 4. 
        power *= 2  // Shortcut to write power = power * 2. 
        ++count  // Its same as count++ or count += 1. 
    } 
    println(power)  // We have calculated 5th power of 2. 


    // Using import kotlin.math.pow as we have done most above 

    val base = 4.0 
    val exponent = 3.0 
    val result = base.pow(exponent) 
    println("$base^$exponent = $result")  // But this works only for Double. 
}
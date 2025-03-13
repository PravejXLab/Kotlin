fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {  // Higher order function. 
    return operation(a, b) 
} 

val power: (Int) -> Int = {it * it}  // Lambda function. 

fun main() {
    val sum = operate(3, 4) { x, y -> x + y }    
    val diff = operate(12, 30) { x, y -> y - x } 
    val product = operate(12, 9) { x, y -> x * y } 
    val quotient = try { operate(12, 0) {x, y -> if (y != 0) x / y else throw IllegalArgumentException ("Cannot divide by Zero.")} 
    } catch (e: IllegalArgumentException) { println(e.message) 
    null }  
    print("sum = $sum, diffrence = $diff, product = $product, Quotient = ${quotient ?: "Undefined!"}, Square = ${power(89)}") 
}
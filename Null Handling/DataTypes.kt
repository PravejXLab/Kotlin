fun main() {
    // Data Types for text -- Char, String. 

    val alphabet: Char = 'D'  // Character Type, assign value in single Quote. 
    val name: String = "Pravej Alam"  // String type, assigned in double Quote. 
    println("$alphabet is Char and $name is String.") 


    // Data Types for Number -- Byte, Short, Int, Long, Double, Float. 

    val byteMaxValue: Byte = Byte.MAX_VALUE  // variable is Byte type because we have explicitly assigned. 
    val byteMinValue = Byte.MIN_VALUE  // variable should be Int but its Byte because RHS is Byte type. 
    println("Max. value of Byte = $byteMaxValue, but Min. value of Byte = $byteMinValue") 

    val shortMaxValue = Short.MAX_VALUE  // Kotlin is implicit means no need to assign type, it automatically detects. 
    val shortMinValue: Short = Short.MIN_VALUE  // If we do not assign type, Kotlin considers Int by default. 
    println("Max. value of Short = $shortMaxValue, but Min. Value of Short = $shortMinValue") 

    val number = 0  // It is Int by default, unless explicitly stated. 
    val intMaxValue: Int = Int.MAX_VALUE  
    println("Number is $number, Min. value of Int = ${Int.MIN_VALUE} and Max. value of Int = $intMaxValue") 

    val maxLongValue = 9223372036854775807  // It's long, stores very long numbers like Phone Number 
    val minLongValue: Long = Long.MIN_VALUE  // Long take too much space, so its recommended to store it as string. 
    println("Max. value of Long = $maxLongValue, Min. value of Long = $minLongValue")
    println("Assigning value greater than 9223372036854775807 requires Big Integer Import, its out of Range")  

    val numDouble: Double =  35.0  // Decimal numbers are Double by default, to change in float add F as suffix with value. 
    val numFloat = 90071992547409939223372036854779790777F // Double and Float can store extremely Large values. 
    println("Value of Double = $numDouble and of Float is $numFloat")  // But still not used because it lost precision. 
}
fun main() {
    // Taking User Input

    print("Please Enter your name: ")  // print will allow Input in same Line. 
    val name = readln()  // This syntax will take user Input. 
    print("Please Enter your age: ") 
    val age = readln()  
    println("Your name is $name and You are $age years old!") 


    // Input Conversion 

    print("Enter Number to calculate ASCII: ") 
    val alphabet = readln().toInt()  // .toChar() is mostly used for ASCII which requires integer.
    val ascii = alphabet.toChar()  // So, we have converted String into Integer using .toInt(). 
    println("ASCII of $alphabet is $ascii")    

    print("Enter your phone number: ") 
    val phone = readln()  // We can also use readln().toString(), this will minimize work. 
    val phoneNumber = phone.toString()  // This syntax will convert phone number into String. 
    println("Your Phone number is: $phoneNumber")  

    print("Enter 4 digit Coupon Code: ")  
    val couponCode = readln().toShort()  // This converts Integer into Short. 
    println("Congratulations! On your coupon code: $couponCode, You have won 1GB Data.") 

    print("Which is the smallest 1 digit number: ")
    val number = readln().toByte() 
    println("According to You, The smallest 1 digit number is $number") 

    print("Enter an Integer, I will convert into Float: ") 
    val num = readln()  // Assigning in two steps is necessary here. 
    val numToFloat = num.toFloat()  // We can also convert a Double to Float. 
    println("Float conversion of $num is $numToFloat")  

    val numToConvert = 20.toDouble()  // Its not necessary, we can only convert user Input. 
    println("Double of 20 is $numToConvert")  

    println("Long conversion of 100 is same: ${100.toLong()} ") 

// If user Input is against Expected Type, It will throw Error. 

}
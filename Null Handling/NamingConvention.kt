/* com.project.learn */  // Package name uses lowercase words separated by dots. 

fun main() {
    // camelCase Naming Convention -- 

    val userLanguage = "Kotlin"  // Used for variable names 
    var accountBalance = 25000 
    fun calculateTotalPrice() {}  // Used for functions naming  

    println("UserLanguage: $userLanguage, AccountBalance: $accountBalance") 


    // Naming conventions to avoid --

    // snake_case Naming Convention --
    val case_avoid = "Snake"  // Allowed in language like Python but not Kotlin. 
    fun get_user_name () {}  // Not allowed, use camelCase. 

    // Hangarian Notation -- 
    val strNameOfCountry = "India"  // Do not Assign variable Type in this way. 
    val IntYearOfIndependence = 1947  // Old style used in C++ not in Kotlin because Kotlin is type Inference. 
    println("Name of country: $strNameOfCountry, and Year of Independence: $IntYearOfIndependence")

    // Single word Naming 
    var m = 5  // i is single word naming, not allowed here. 
    
    for (i in 1..5) {
        println(i)     // single word naming is allowed in Loops. 
    }
}


// PascalCase Naming Convention -- 

class LoveFromKotlin  // Used for class naming 
object AndroidManager  // Used for object naming 
interface OnClickListener  // Used for interface naming 


// UPPER_SNAKE_CASE Naming Convention -- 

const val API_KEY = "ABC123XYZ"  // Used for assigning constant values
const val YOUR_PIN = 906578   // Just an example Pin 😅 
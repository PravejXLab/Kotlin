import java.text.DecimalFormat  // This import allows decimal formatting.
import java.text.SimpleDateFormat  //This allow formating of date & Time. 
import java.util.Date  // This allows detecting of System date and Time. 

fun main() {

    // String formatting 
    val name = "Pravej" 
    val age = 20 
    val formattedString = String.format("My name is %s and i am %d years old.", name, age)   
    println(formattedString) 

    val pi = 3.141592 
    println("Value of pi = %f".format(pi))
    println("Value of pi = %.2f".format(pi))  //This limits value upto two decimal places


    // Number Formatting 
    val formatter = DecimalFormat("#,###.00") 
    val number = 655123456.7890  
    println(formatter.format(number))
    println()  // Just to Add an space  


    // print column wise
    println("Name\tAge\tCity") 
    println("Mahoan\t16\tMumbai") 
    println("Angel\t18\tPatna") 
    println("Rehman\t22\tDelhi") 
    println()  // Just for a line break.


    // Aligning text with Padding 
    val text = "Pravej" 
    println(text.padStart(10, '-'))  // Icreases text size by 10 by putting '-' as Prefix. 
    println(text.padEnd(3, '~'))  // literal is less than text length, so there will be no effect. 


    // Multiline String Formating 
    val adject = """
    Kotlin is 
    very easy language. 
    Isn't it?
    """
    println(adject)  // Without .trimIndent()
    
    val adjects = """
    Kotlin is 
    very easy language. 
    Isn't it?
    """.trimIndent()  // It removes leading Spaces, not internal spaces. 
    println(adjects)  // With .trimIndent() 

    // Rich String Templates 
    val friends = """
    My Best friends are: 
    Rohit
    Sunny
    Tanvi
    """.replaceIndent(">>> ")  // It breaks each lines and start with this indent in new lines.       
    println(friends)


    // Formatting Date & Time 
    val dateFormat = SimpleDateFormat("HH:mm:ss  dd MMM yyyy") 
    val dateTime = dateFormat.format(Date())  
    println(dateTime)  
}
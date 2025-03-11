// This two slashed sign is used to comment out the line in which it is used. 
/* This is also used for comment out multiple lies. 
    Comment is used to make our code readable which is ignored by kotlin. */
    

fun main() {    // This function tells the JVM, where to start running the code.  
    // Anything outside this function won't be executed unless called inside main function. 

    println("Pravej Alam is my name --")  //Switches to next lines to execute next line command
    print("PravejXLab is my personal space!")  // Does not switch to next line.
    print("\n")  // \n is used to add a line break--
    print("I believe in consistency \nas it increases like compounding \nwhich is according to Einstein the 8th wonder in the world \n") 

    // variables name cannot start with number, 
    // we can only use '_' (underscore) or number with variable name

    var name = "Pravej Alam" // var is mutable variable
    println(name) 

    val number = 7845 // This is immutable variable
    println(number) 

    name = "PravejXLab" // Because it's mutable, i have changed it.
    println(name)   // but if i try to change number, it will throw error. 

    val multiLineString = """Hey, I am multi line string
    You can put as much line you like to add.
    This can be used to store long sentences or paragraph and 
    it is triple quoted as you can see""" 

    println(multiLineString) 

}
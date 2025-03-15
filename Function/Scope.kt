fun main() {
    // Let -> Use it with it to return lambda result. 

    print("Please Enter your name: ") 
    val name1 = readlnOrNull()  // This takes user name as input.
    val realName = name1?.let {  // name?.let takes input only if not null. 
        it.uppercase()  // it refers to name 
    }
    println("Uppercased name: $realName") 

    
    // Run -> Use "this" with it to return lambda result. 

    data class name2(var name: String, var age: Int) 
    val fullName = name2("Pravej", 12).run {  // Used to modify the object.   
        name = "John"
        age = 16
        "Name: $name, Age: $age"
    }
    println(fullName)   


    // Apply -> Used with "this" to return object itself. 

    data class name3(var name: String, var age: Int) 
    val nameApplied = name3("John", 7).apply { 
        name = "Pravej" 
        age = age + 10 
    }

    println(nameApplied)  


    // Also -> Used with it to return object itself. 

    val userName = "Pravej"
    .also {require(it.length > 3) { "UserName too Short!" } }  // Used for logging. 
    println(userName) 


    // With -> Similar to run but used to multiple operations at once. 
    val numbers = listOf(1, 2, 3, 4, 5)

    val sum = with(numbers) {
        println("List contains: $this")  // Uses `this`
        sum()  // Returns the sum of elements
    }

    println(sum)  // Output: List contains: [1, 2, 3, 4, 5] → 15

    
}
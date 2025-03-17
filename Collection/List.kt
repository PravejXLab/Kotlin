fun main() {
    // Immutable List 

    val immutableList = listOf("Mango", "Banana", "Litchi", "Grapes")  // Can't modify, read only. 
    println("List of my favourite fruits: $immutableList")
    println("Fruit at index 0: ${immutableList[0]}")  // Get first element from list. 
    println("Size of list of fruits: ${immutableList.size}")  // It counts no. of elements. 
    println("Fruit at index 1: ${immutableList.get(3)}")  // It's similar to gettiong number at an index. 
    println(immutableList.contains("banana"))  // Returns false because it's case sensitive. 
    println(immutableList.indexOf("Grapes"))   // This tells the index of the element in list. 



    // Mutable List 

    val mutableList = mutableListOf("Kotlin", "Jetpack Compose", "ML", "JavaScript")  // It can be changed
    println("List of mastering Technologies: $mutableList")
    mutableList.add("Python")  // It will add Pyhton to the list. 
    mutableList.remove("C#")  // It will remove C# if exist.  
    mutableList[2] = "AI"  // It will replace 3rd element with AI 
    mutableList.removeAt(3)  // It will remove 4th element. 
    mutableList.set(2, "C++")  // It will add C++ at 3rd place. 
    println("List of Technologies i am passionate about: $mutableList") 



    // List Iteration 

    val numbers = listOf(3, 7, 51, 784) 
    val animals = mutableListOf("Tiger", "Panther", "Pandas", "Yeti")  

    for (num in numbers) {  // Method 1, using loop 
        print("$num, ")
    }
    println()  // Line break. 

    animals.forEach {print("[$it] ")}  // Method 2, using forEach. 
    println()

    for (i in animals.indices) {  // Method 3, Using indices. 
        println("Animal at Position ${i+1}: ${animals[i]}")
    } 



    // List Operation 

    val numerical = listOf(34, 8, 0, 0, 73) 
    val cube = numerical.map { it * it * it } 
    val evenNumbers = numerical.filter { it % 2 == 0 } 
    val sortedNums = numerical.sorted()    
    val sortedDesc = numerical.sortedDescending()
    println(numerical) 
    println(cube) 
    println(evenNumbers) 
    println(sortedNums) 
    println(sortedDesc) 
    
    val wordy = listOf("Statistics", "Geometry", "Mechanics", "Graph Theory") 
    println("Sorted Alphabetically: ${wordy.sorted()}")  

}
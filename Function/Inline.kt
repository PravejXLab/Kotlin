inline fun repeatAction(times: Int, action: () -> Unit) {  // Action can also be passed like this. 
    for (i in 1..times) {  // It will repeat the action times times. 
        action()  
    }
} 

fun greeting(name: String, timeOfDay: String): String {  // It reduces overhead. 
    return when (timeOfDay.lowercase().trim()) {  
        "morning" -> "Good morning $name! Have a good day Ahead" 
        "afternoon", "after noon" -> "Good Afternoon $name! Hope you are having a productive day" 
        "evening" -> "Good Evening $name! Time to relax and unwind" 
        "night" -> "Good Night $name! Sleep well and sweet dreams" 
        else -> "Hello $name! Hope you are doing well" 
    }
}

fun main() {
    repeatAction(3) { 
        println("Hello Pravej Alam") 
    }

    print("Please Enter your name: ")
    val name = readln()  // We can use the same variable name in different functions. 
    print("Please Enter time of day: ") 
    val timeOfDay = readln()  
    println(greeting(name, timeOfDay)) 
}
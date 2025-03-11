fun main() {
    
    val dayName = 5 
    when (dayName) {  // This is the modified version of if else conditional. 
        1 -> println("Monday")  // If we have multiple logic, then we can directly use when. 
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday") 
        else -> println("Invalid Entry!")  // else is necessary otherwise it will throw error. 
    }


    print("In which month yor are: ") 
    val monthName = readlnOrNull()?.toIntOrNull()  // else will now consider null or invalid. 
    val getMonth = when(monthName) {  // We can also use if, else if (11 times) and else for same result. 
        1 -> "January" 
        2 -> "February" 
        3 -> "March" 
        4 -> "April" 
        5 -> "May" 
        6 -> "June" 
        7 -> "July" 
        8 -> "August" 
        9 -> "September" 
        10 -> "October" 
        11 -> "November" 
        12 -> "December" 
        else -> "invalid Entry!"  // else does not include invalid or null value by default.  
    } 
    println(getMonth)  // We can store when logic in a variable or we can also use directly. 


    print("What is your rank in school: ") 
    val rank = readlnOrNull()?.toIntOrNull() 
    val status = when (rank) {
        1, 2, 3 -> "🎉 You will get medal as reward."  // Any of 1, 2 or 3.
        in 4..10 -> "👋 You have performed well."   // Any one from 4 to 10. 
        !in 4..10 -> "Try again next time."  // Not from this range. 
        else -> "Invalid Entry!" 
    } 
    println(status) 


    print("What is the score of team 1: ") 
    val score1 = readlnOrNull()?.toIntOrNull() ?: 0 
    print("What is the score of team 2: ") 
    val score2 = readlnOrNull()?.toIntOrNull() ?: 0 
    when {  // We can also store these in a variable and print separately, instead of using println multiple times. 
        score1 > score2 -> println("Team 1 is ahead by ${score1 - score2}") 
        score2 > score1 -> println("Team 2 is ahead by ${score2 - score1}") 
        score1 == score2 -> println("Both teams has scored equal.")   
    }
}
fun main() {
    // Make Square with stars * 
    val n = 5 
    for (i in 1..n) {  // Think of like matrix or determinant. 
        for (j in 1..n) {  // Remember how we assign location name. 
            print("*  ")  // prints at (1, 1), (1, 2) .. (2, 1) .. (5, 5) 
        }
        println()  
    }
    println()


    // Make Hollow Square with @ 
    for (i in 1..5) {
        for (j in 1..5) {
            if (i == 1 || i == n || j == 1 || j == n) {
                print("@  ")
            } else {
                print("   ")
            }
        }
        println() 
    }
    println()


    // Square with numbers 1 to 5 in each 5 rows. 
    for (i in 1..5) {
        for (a in 1..5) {
            print("$a  ")
        }
        println() 
    }
    println() 


    // Increasing number in column square 
    for (i in 1..5) {
        for (a in 1..5) {
            print("$i  ")
        }
        println() 
    }
    println() 


    // Hash Pattern 
    for (i in 1..5) {
        for (m in 1..5) {
            if (i == 2 || i == 4 || m == 2 || m == 4) {
                print("#  ")
            } else {
                print("   ")
            }
        }
        println() 
    }
    println() 


    // Checkboard Pattern 
    for (i in 1..5) {
        for (j in 1..5) {
            if ((i + j) % 2 == 0) {
                print("+  ")
            } else {
                print("   ") 
            }
        }
        println()
    }
    println() 


    // Hollow Square with numbers 
    for (x in 1..5) {  // Outer loop for rows (x)
        for (y in 1..5) {  // Inner loop for columns (y)
            if (x == 1 || x == 5 || y == 1 || y == 5) {
                print("$y  ")  // Print column number at borders
            } else {
                print("   ")  // Print space inside
            }
        }
        println()  // Move to the next line
    }
    println() 


    // Hollow Square with increasing numbers 
    for (x in 1..5) {  
        for (y in 1..5) {  
            if (x == 1 || x == 5 || y == 1 || y == 5) {
                print("$x  ")  // Print row number at borders
            } else {
                print("   ")  
            }
        }
        println()  
    }
    println() 
    

    // multiplication of all 9 cases 
    for (num in 1..3) {
        for (each in 1..3) {
            print("$num * $each = ${num * each}\t") 
        }
        println() 
    }
    println() 
}
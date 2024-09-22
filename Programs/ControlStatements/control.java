/*
 * Controls Statements 
 *  - Decision Making (If-else, ladder if-e, nested if-else) 
 *  - Iterations (for , while,do-while, for(each))
 *  - Jump Statements (Break,continue,switch)
 * 
 *--------------------------------------------------------------
 * keywords and identifier
 * To introduce basic data into data we need datatypes
 * You also need to control it 
 * Operations over the data are perform using operators 
 *  - Unary - needs 1 operands
 *  - Binary - needs 2 operands
 *  - Ternary - more than 2 operands 
 *    
 */

// --------------------------------------------------
// If statement 
class control {
    public static void main(String[] args) {
        int Num1 = 100;
        int Num2 = 200;

        if (Num1 > Num2) {
            System.out.println("Num1 is greatest of all time (GOAT) : " + Num1);
        } else {
            System.out.println("Num2 is greatest of all time (GOAT) : " + Num2);
        }
        System.out.println("End of decade");
    }
}

// ---------------------------------------------------------------
// nested if else (else if)
/*
 * Drawback : CPU overhead (waste of cpu cycle)
 * to overcome this drowback switch statment was introduced
 * Switch is faster than ladder if-else
 */
class decision {
    public static void main(String[] args) {
        int Num1 = 1;

        if (Num1 == 1) {
            System.out.println("Monday");
        } else if (Num1 == 2) {
            System.out.println("Tuesday");
        } else if (Num1 == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("It a holiday");
        }
    }
}

// nested if else means if else in if else
class nested {
    public static void main(String[] args) {
        int Num1 = 100;
        int Num2 = 2000;
        int Num3 = 300;

        if (Num1 > Num2) {
            if (Num1 > Num3) {
                System.out.println("Num1 is greatest of all time : " + Num1);
            } else {
                System.out.println("Num3 is greatest of all time : " + Num3);
            }
        } else {
            if (Num2 > Num3) {
                System.out.println("Num2 is greatest of all time : " + Num2);
            } else {
                System.out.println("Num3 is greatest of all time : " + Num3);
            }
        }
    }
}
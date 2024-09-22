/* */
// Want to repeat my name 10 times

// For Loop
// 3 expressions 
/*
 * First expression is from where to start 
 * Second expression is repetition
 * third expression 
 */
class iteration {
    public static void SumOfInt() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {
        SumOfInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Vedant");
        }
    }
}

// While Loop
/*
 * - Entry check
 */

class whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Vedant");
            i++;
        }
    }
}

/*
 * Do while loop
 * - Exit check
 * 
 */
class dowhileloop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Vedant");
            i++;
        } while (i < 10);
    }
}
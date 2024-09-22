class breakst {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

}

// continue : is used to skip the current iteration
class continuest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

// Switch
class Switch {
    public static void Add() {
        int Num1 = 10;
        int Num2 = 20;
        System.out.println("Add is : " + (Num1 + Num2));
    }

    public static void Sub() {
        int Num1 = 10;
        int Num2 = 20;
        System.out.println("Sub is : " + (Num1 - Num2));
    }

    public static void Mul() {
        int Num1 = 10;
        int Num2 = 20;
        System.out.println("Mul is : " + (Num1 * Num2));
    }

    public static void Div() {
        int Num1 = 10;
        int Num2 = 20;
        System.out.println("Div is : " + (Num1 / Num2));
    }

    public static void main(String[] args) {
        int choice = 4;
        switch (choice) {
            case 1:
                Add();
                break;
            case 2:
                Sub();
                break;
            case 3:
                Mul();
                break;
            case 4:
                Div();
                break;
            default:
                System.out.println("Wrong Input");
                ;
        }
    }
}
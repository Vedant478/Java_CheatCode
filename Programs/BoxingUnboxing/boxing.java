package Programs.BoxingUnboxing;

/* Wrapping a primitive data value into a wrapper class is known as boxing 
 * Wrappper class 
 */
class wrapper {
    public static void main(String[] args) {
        // int a=100;
        Integer a1 = new Integer(100); // Wrapper class with integer // Boxing
        System.out.println(a1);
    }
}

class boxing {
    public static void main(String[] args) {
        int a = 100;
        Integer a1 = a; // Auto Boxing or boxing is always in compatiable int
        System.out.println(a1);
    }
}

class unboxing {
    public static void main(String[] args) {
        int a = 100;
        Integer a1 = a;
        // System.out.println(a1);
        // Converting wrapper class into primitive data type and this process is know as
        // unboxing
        int b;
        b = a1;
        System.out.println(b);

    }
}

class unboxing1 {
    public static void main(String[] args) {
        String str = "1000";
        int a = 100;
        Integer a1 = a;
        // System.out.println(a1);
        // Converting wrapper class into primitive data type and this process is know as
        // unboxing
        int b;
        b = Integer.parseInt(str);
        System.out.println(b);

    }

    // Number Format Exception
    public static void main4(String[] args) {
        String str = "1000GH";
        int b = Integer.parseInt(str);
        System.out.println(b);
    }
}
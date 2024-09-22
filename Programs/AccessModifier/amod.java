/*
    --------------------------
 * |4 access modifier in java |: They are used to maintain the accessibility of class data or methods
 * ----------------------------
 * 1) Public : Public can be accesible in everywhere
 * 2) Protected : Protected can be accesible in same file but not in different file
 * 3) Private :  private variables cannot be access outside its own class

 * 4) Default (package level private)
 */
class amod {
    protected static int Num1;

    public static void Display() {
        System.out.println(Num1);
    }
}

class abc {
    public static void main(String[] args) {
        System.out.println(amod.Num1);
    }
}

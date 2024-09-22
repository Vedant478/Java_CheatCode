package Programs.NarrowWide;

/* Implicit casting  
 * Storing smaller to bigger
 * converson a 32 bit into 32 byte is widening
 */
class narrow {
    public static void main(String[] args) {
        int b = 100;
        int a;
        a = b; // widening or implicit casting / conversion
        System.out.println(a);
    }
}

/*
 * Explicit type casting (Narrowing)
 * Storing from larger to smaller
 */
class narrow1 {
    public static void main(String[] args) {
        int a = 900;
        byte b;
        b = (byte) a; // Type mismatch: cannot convert from int to byte // Forcing the compiler
        System.out.println(b);
    }
}

public class comments {
    /**
     * My name is vedant
     * I am designing java class
     * class name is classes1
     */
    public static void main(String[] args) {
        System.out.println("Size of int in Bytes " + Integer.BYTES + " Bytes");
        System.out.println("Max value of int in Bytes " + Integer.MAX_VALUE + " Bytes");
        System.out.println("Min value of int Bytes " + Integer.MIN_VALUE + " Bytes"); // To print a message just us "+"
        System.out.println("Size of int in Bytes " + Integer.SIZE + " Bytes"); // To print a message just us "+"

    }
}

// javap -c classfilename It is used to read the byte code
// javap -v classfilename It gives more information

/*
 * Comments
 * 
 * Type 1 : Single Line Comments
 * - We can put // before any line to comment
 * Type 2 : Block Comments (Multiple Line Comments)
 * /*
 * - We can put /
 **/ // before multiple line comments
// Type 3 : Dakumentation Comments
/**
 * 
 */

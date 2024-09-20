package Programs.DataType;

/*
 * ###################### Primitive Datatypes ############################
 * - byte 1 Byte 
 * - short 2 Byte
 * - int 4 Byte
 * - long 8 Byte
 * - float 4 Byte
 * - double 8 Byte
 * - boolean 1 Bit
 * - char 2 Byte
 * 
 * ###################### Non-Primitive Datatypes ############################
 * Also known as value data-type or reference data
 * type
 * - classes
 * - interfaces
 * - arrays
 * ----------------------------------------------------------------------------------------------------------------
 * Rule 1: If ur using local variables without inintialization then its a compile time error
 * Rule 2: Every value is a double in java if u want to treat like float just use f after the floating point value 
 * 
 */

class datatype {
    public static void main(String[] args) {
        int a; // Declartion
        a = 100; // Intialization
        a = 300;

        int b = 90; // Declaration + Intialization
        System.out.println(b);
    }
};

class datatype1 {
    public static void main(String[] args) {
        float f;
        f = 100.00f;
        System.out.println(f);
    }
}

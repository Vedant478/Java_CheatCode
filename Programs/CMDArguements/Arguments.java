package Programs.CMDArguements;

class hello {
    public static void main(String[] args) {
        int Num1;
        int Num2;
        int Num3;

        Num1 = Integer.parseInt(args[0]);
        Num2 = Integer.parseInt(args[1]);
        Num3 = Integer.parseInt(args[2]);

        int Res = Num1 + Num2 + Num3;
        System.out.println(Res);
    }
}

/*
 * Run this code
 * javac /Programs/CMDArguements Arguments.java
 * java /Programs/CMDArguements hello
 */

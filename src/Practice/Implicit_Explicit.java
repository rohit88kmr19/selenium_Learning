package Practice;

public class Implicit_Explicit {
    public static void main(String[] args) {
        int val=456;
        byte b1 = (byte)val; //Explicit Casting
        System.out.println(b1);

        byte b2 =30;
        int val1 =b2;// Implicit Casting

        System.out.println(val1);

        long ph_no =9898989898L;
       // short s = ph_no;
        short s=(short)ph_no;
        System.out.println(s);



    }
}

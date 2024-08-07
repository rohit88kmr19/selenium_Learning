package Practice;

public class StringBuilder_Buffer {
    public static void main(String[] args) {
        //Strings--Immutable in nature
        //String Builder and String buffer -- Mutable- We can change the string but the new string will not be created.

       StringBuffer sb = new StringBuffer("Rohit");

        // change the value of string-buffer

        sb.append("Kumar");

        System.out.println(sb);

        StringBuilder s1 = new StringBuilder("Rohit");
        System.out.println(s1.delete(1,3).toString());

//        s1.append("Kumar1");
//
//        System.out.println(s1);
//
//        System.out.println(s1.reverse().toString());







    }



}

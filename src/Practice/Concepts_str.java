package Practice;

public class Concepts_str {
    public static void main(String[] args) {
        String name = "rohit";

        String name2 = new String("Kumar");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        //How they store the value in JVM.

        //SCP and Heap- JVM

        String s1="Pramod";
        String s2=s1;
        System.out.println(s2);
        String s3= s2.toLowerCase(); // 1 string here for lower case
        System.out.println(s3);
        System.out.println(s2);// 1 string for this s2
        //Here we have two strings now

        String str1 = "The Testing Academy";
        String str2 = "The Testing Academy";
        //Here, only one string will be created with space in string constant pool as both the names are same.






    }
}

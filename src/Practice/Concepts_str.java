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

        System.out.println(str1==str2); //check for the reference means location.
        System.out.println(str1.equals(str2)); // check for the contents

        String name1 = "The Testing Academy";
        String name3 = new String("The Testing Academy");
        System.out.println(name1==name3); //check for the reference means location.False because location is different.
        System.out.println(name1.equals(name3)); // check for the contents. True because the content is matching

        System.out.println("-------------------------------------");

        String name4 = new String("rohit");
        String name5 = new String("rohit");
        String name6 = new String("rohit");
        System.out.println(name4==name5);//False because location is different
        System.out.println(name5==name6);//false because location is different.
        System.out.println(name4.equals(name5));//True bevause matching the content.

        System.out.println("-------------------");
        String t1="rohit";
        char c= t1.charAt(4);//charat starts form 0
        System.out.println(c);
        t1=t1.concat("kumar");
        System.out.println(t1);

        System.out.println("-----------------");

        String password ="Rohit123";

        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // Here two strings will be created.

        System.out.println(pass_u==password);//False location is different.
        System.out.println(pass_u.equals(password));//False content not matching one is lowercase and one is uppercase.

        System.out.println(pass_u.equalsIgnoreCase(password));//True because ignoring the lowercase and Upper case letter.

        System.out.println(password.substring(0,5));//
        System.out.println(password.indexOf('i'));//Index starts from 0
        System.out.println(password.length());//length starts from 1

        double sq =Math.sqrt(16);

        int result = Math.max(10,23);
        System.out.println(sq);
        System.out.println(result);



        //Garbage collection , when JVM terminates the programme, ten it clears the memory.

    }
}

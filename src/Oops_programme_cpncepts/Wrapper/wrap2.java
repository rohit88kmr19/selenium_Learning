package Oops_programme_cpncepts.Wrapper;

public class wrap2 {
    public static void main(String[] args) {
       // Integer i = new Integer();// It was allowed before java 9

        Double d=3.14;// Wrapper class, stored in heap memory

        double val = d.doubleValue(); // stored in continuous memory
        System.out.println(d);
        System.out.println(val);

        String s1= "rohit";// Stored in String constant pool
        String s2 = new String("kumar");// Stored in heap memory
    }
}

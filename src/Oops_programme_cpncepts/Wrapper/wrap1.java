package Oops_programme_cpncepts.Wrapper;

public class wrap1 {
    public static void main(String[] args) {
        String num="10";
       // int a= (int)num; // Tyope casting not possible.
// String to Object conversion
        Integer a1= Integer.valueOf(num);
        System.out.println(a1);

        // String to Primitive.

        int a= Integer.parseInt(num); //Using wrapper class
        System.out.println(a);
    }
}

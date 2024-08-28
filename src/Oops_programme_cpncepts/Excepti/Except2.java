package Oops_programme_cpncepts.Excepti;

public class Except2 {
    public static void main(String[] args) {


        int c=10/0;
        try {
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println(c);
        System.out.println("END");

    }
}

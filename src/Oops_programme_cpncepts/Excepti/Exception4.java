package Oops_programme_cpncepts.Excepti;

public class Exception4 {
    public static void main(String[] args) {
        final double pi =3.14;

        int a=0;

        try {
            int x=10/a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("I will");
        }

    }
}

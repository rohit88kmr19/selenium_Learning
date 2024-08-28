package Oops_programme_cpncepts.Excepti;

public class Exceptio3 {
    public static void main(String[] args) {
        System.out.println("Start of the Programme");

        int b=0;
        //String ip= null;// ArrayIndexBoundOfException
        try {
          String  ip = args[0];// ArrayIndexBoundOfException
            int a= Integer.parseInt(ip);
            b=1000/a;
        } catch (ArithmeticException|NumberFormatException| ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the Programme");
    }
}

package Oops_programme_cpncepts.Excepti;

public class Exceptions {
    public static void main(String[] args) {
        String ip=args[0];// ArrayIndexBoundOfException
        int a = Integer.parseInt(ip);// Number format Exception as We cannot convert the string to integer.
        int b=1000/a;// Arithematic Exception
        System.out.println(b);

    }
}

package JavaProgrammes;

import java.util.Scanner;

public class Factorial_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n =sc.nextLong();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}

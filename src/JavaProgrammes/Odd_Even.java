package JavaProgrammes;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double user_inp= sc.nextDouble();
        if(user_inp%2==0)
        {
            System.out.println("Even");
        }
            else {
            System.out.println("Odd");
        }
    }
}

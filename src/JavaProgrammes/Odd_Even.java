package JavaProgrammes;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long user_inp= sc.nextLong();
        if(user_inp%2==0)
        {
            System.out.println("Even");
        }
            else {
            System.out.println("Odd");
        }
    }
}

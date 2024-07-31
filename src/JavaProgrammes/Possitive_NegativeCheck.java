package JavaProgrammes;

import java.util.Scanner;

public class Possitive_NegativeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int no=sc.nextInt();

        if (no>0)
        {
            System.out.println("Possitive Number");
        }
        else if (no<0)
        {
            System.out.println("Negative No");
        }
        else{
            System.out.println("Zero");
        }
    }
}

package JavaProgrammes;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int arm=0, a,d,no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        no = sc.nextInt();
        d=no;
        while(no>0)
        {
            a=no%10;
            no=no/10;
            arm=arm+a*a*a;
        }
        if (arm==d)
        {
            System.out.println("Arm Number");
        }
        else {
            System.out.println("No is not armstrong");
        }
    }
}

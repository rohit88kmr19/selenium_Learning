package JavaProgrammes;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the leap year");

        int ly = sc1.nextInt();

        System.out.println("The Year is :---" +ly);

        if((ly%4==0 && ly %100!=0)|| (ly %400 ==0))
        {
            System.out.println("The number is Leap Year");
        }
        else
        {
            System.out.println("Not a leap Year");
        }
    }
}

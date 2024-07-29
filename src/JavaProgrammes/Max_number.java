package JavaProgrammes;

import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 =sc.nextInt();
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();
        //System.out.println("The maximum no is---:"+Math.max(num1,num2));

        if (num1>num2){
            System.out.println(num1);
        } else if (num2>num1) {
            System.out.println(num2);

        }
        else
        {
            System.out.println("Equal");
        }
    }
}

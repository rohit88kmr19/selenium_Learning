package JavaProgrammes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prog_AgenameSalPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();

        System.out.println("Enter your age");
        int age= sc.nextInt();

        System.out.println("Enter you salary");
        double salary=sc.nextDouble();

        System.out.println("Your details are\n"+name+ "Age\n"+age+"salary\n"+salary);
        sc.close();
    }
}

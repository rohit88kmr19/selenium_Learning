package JavaProgrammes;

import java.util.Scanner;

public class Largest_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        int[] sal = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the salary fo different employee" +" " + (i + 1) + ":");
            sal[i] = sc.nextInt();

        }
        for (int i = 0; i < length; i++) {
            System.out.println("Salary of Employee" + " " + (i + 1) + ":"+sal[i]);
        }
            int highest_sal = sal[0];
            for (int i = 1; i < sal.length; i++) {
                if (sal[i] > highest_sal) {
                    highest_sal = sal[i];
                }
            }
                 System.out.println("The highest salary is:--"+highest_sal);
        }
    }

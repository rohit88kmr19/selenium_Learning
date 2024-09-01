package Oops_programme_cpncepts.Excepti;

import java.util.Scanner;

public class except7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        if (name.equalsIgnoreCase("Rohit"))
        {
            try
            {
                throw new Exception("Not allowed");
            }
           catch (Exception e)
            {
                System.out.println("Exception");
            }
        }
        else {
            System.out.println("Allowed");
        }


    }
}

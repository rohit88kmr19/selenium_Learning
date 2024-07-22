package JavaProgrammes;

import java.util.Scanner;

public class triangleClassifier {
    public static void main(String[] args) {
        //"Write a program that classifies a triangle based on its side lengths".

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the sides for the triangle");
        int sides1 = sc.nextInt();
        int sides2 = sc.nextInt();
        int sides3 = sc.nextInt();


       System.out.println("The sides of the triangle are:" +sides1+ ""+ sides2 + "" +sides3);

        if(sides1==sides2 && sides2==sides3)
        {
            System.out.println("The Triangle is equilateral triangle");
        } else if (sides1==sides2 || sides2==sides3 || sides1==sides3) {
            System.out.println("The Triangle is isosceles Triangle");
        }
        else if (sides1!=sides2 && sides2!=sides3 && sides1!=sides3)
        {
            System.out.println("The Triangle is Scalene Triangle");
        }
    }
}

package Practice;

import java.util.Scanner;

public class Avg_marks_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the sub " + (i + 1));
            marks[i] = sc.nextFloat();
        }

        // Optionally, you can print out the marks to verify input
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
        }


        float avg = (marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4])/5;
        System.out.println("Avg is -> "+avg);





    }
}

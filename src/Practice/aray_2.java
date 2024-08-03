package Practice;

import java.util.Scanner;

public class aray_2 {
    public static void main(String[] args) {

        int[] marks = new int[3];

        System.out.println(marks[0]);
        System.out.println(marks[1]);


        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] marks1 = new int[length];

        for (int i=0;i<length;i++)
        {
            System.out.println("Enter the marks-->"+" "+(i+1)+":");
            marks1[i]=sc.nextInt();

        }
        //System.out.print("THe marks are-->"+" "+marks1[i]);

        marks[0]=sc.nextInt();
        marks[1]=92;
        marks[2]=93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean[] is_married={true, false, true};

        for (int i=0;i< is_married.length;i++)
        {
            is_married[i]=sc.nextBoolean();
        }



    }
}

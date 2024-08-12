package JavaProgrammes;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str=sc.nextLine();
        String revString="";
        for (int i=str.length()-1;i>=0;i--)
        {
            revString+=str.charAt(i);

        }
        System.out.println(revString);
    }
}


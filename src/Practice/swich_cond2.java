package Practice;

import java.util.Scanner;

public class swich_cond2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vowel name");
        char us_inp= sc.next().charAt(0);
        System.out.println(us_inp);
        switch (us_inp) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}



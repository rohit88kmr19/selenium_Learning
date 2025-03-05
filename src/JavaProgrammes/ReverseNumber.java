package JavaProgrammes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 12345; // Example input number
        int reversedNumber = 0;

        // While the number is greater than 0
        while (number != 0) {
            // Get the last digit of the number
            int lastDigit = number % 10;

            // Add the last digit to the reversed number
            reversedNumber = reversedNumber * 10 + lastDigit;

            // Remove the last digit from the original number
            number = number / 10;
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }
    }
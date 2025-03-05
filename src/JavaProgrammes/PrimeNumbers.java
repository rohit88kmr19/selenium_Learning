package JavaProgrammes;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15};

        // List to store prime numbers
        List<Integer> primeNumbers = new ArrayList<>();

        // Iterate through the list
        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers in the list: " + primeNumbers);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // Check divisors from 2 to num-1
        for (int i = 2; i <= num / 2; i++) { // Optimized loop till num/2
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }
    }

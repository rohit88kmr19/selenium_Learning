package JavaProgrammes;

public class ArrayPrimeNumber {

    public static void main(String[] args) {

        int num[] = {1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 12, 13, 14};
        for (int n : num) {
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }

            if (isPrime) {
                System.out.println(n + "is a Prime Number");
            } else {
                System.out.println(n + "is not a Prime Number");
            }

        }
    }
}

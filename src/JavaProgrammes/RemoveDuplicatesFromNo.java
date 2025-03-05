package JavaProgrammes;

public class RemoveDuplicatesFromNo {
    public static void main(String[] args) {

        // Input array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 2, 3, 7, 8, 4, 9};

        // Loop to print the unique numbers
        System.out.println("Unique numbers are:");
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            // Check if the current number is already checked (i.e., duplicate)
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;  // Mark as duplicate if number exists earlier in the array
                    break;
                }
            }

            // Print the number if it's not a duplicate
            if (!isDuplicate) {
                System.out.print(" "+numbers[i]);
            }
        }



    }
}

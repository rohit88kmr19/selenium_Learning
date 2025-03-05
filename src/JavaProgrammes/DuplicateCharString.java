package JavaProgrammes;

public class DuplicateCharString {

    public static void main(String[] args) {

        String str = "programming";

        // Convert string to a character array
        char[] chars = str.toCharArray();

        // Loop through the array
        System.out.println("Duplicate characters are:");
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is already checked (use a flag to avoid checking again)
            boolean isDuplicate = false;

            // Inner loop to compare each character with all others after it
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    // Mark the character as a duplicate
                    isDuplicate = true;
                    break;
                }
            }

            // Print the character if it's a duplicate
            if (isDuplicate) {
                System.out.print(chars[i] + " ");
            }
        }
    }



    }

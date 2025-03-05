package JavaProgrammes;

public class PrintEvenIndexedCharacters {
    public static void main(String[] args) {

        String str = "Hello, I am learning Java programming!";

        // Loop through the string and print characters at odd indices
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {  // Check if the index is odd
                System.out.print(str.charAt(i)); // Print the character at odd index
            }
        }
    }
}

package Practice;

public class Final_Keyword {
    public static void main(String[] args) {
        final int A = 45;
        // int A=67;

        final double PIE = 3.14;
        System.out.println(A);
        System.out.println(PIE);

        char c = '\n';
        System.out.println(c);

        char c1 = '\t';
        char c2 = '\b';
        char c3 = '\r';

        System.out.println("Rohit\n"+ "Kumar"); // New Line
        System.out.println("rohit" +c1+ "Kumar"); //Tab between words
        System.out.println("rohit" +c2+ "Kumar");//backlash, deletes 1 char
        System.out.println("rohit" +c3+ "Kumar");// backlash and deletes 1 word

        // These are called escape characters.
    }

}
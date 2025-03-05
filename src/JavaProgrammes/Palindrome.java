package JavaProgrammes;

public class Palindrome {

    public static void main(String[] args) {

        String str = "malayalam";

        int start=0;
        int end=str.length()-1;
        boolean isPalind =  true;
        while(start<end)
        {
            if (str.charAt(start)!=str.charAt(end))
            {
                isPalind=false;
                break;
            }
            start++;
            end--;
        }
        if (isPalind)
        {
            System.out.println("Palind---->" +str);
        }

        else {
            System.out.println("Not Palind" +str);
        }

    }


}

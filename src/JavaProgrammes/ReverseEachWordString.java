package JavaProgrammes;

public class ReverseEachWordString {

    public static void main(String[] args) {

        String str ="I am good";

        String [] words = str.split(" ");
        String revStr = "";

        for (String word:words)
        {
         String rev= "";
        for (int i=word.length()-1;i>=0;i--)
        {
            rev+=word.charAt(i);
        }

        revStr+=rev+" ";

    }
        System.out.println(revStr);
}}



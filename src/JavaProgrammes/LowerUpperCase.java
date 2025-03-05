package JavaProgrammes;

public class LowerUpperCase {

    public static void main(String[] args) {

        String s = "NITIN";

       char[] charArray= s.toCharArray();

       for (int i=0;i<charArray.length;i++)
       {
           char ch= charArray[i];

           if (ch>='A' && ch<='Z')
           {
               charArray[i]= (char)(ch+32);
           }
       }
        System.out.println(charArray);

    }

}

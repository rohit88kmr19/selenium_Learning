package JavaProgrammes;

public class CountSpaceBetweenWords {

    public static void main(String[] args) {


        String str = "Hello I am good";

        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);

    }
    }


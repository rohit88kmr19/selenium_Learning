package JavaProgrammes;

public class CountOfoccurenceOfCharacter {

    public static void main(String[] args) {


        String str = "AABBCCNNHHUUII";

        for (int i=0;i<str.length();i++)
        {
            char chrCount = str.charAt(i);
            int count=0;

            for (int j=0;j<str.length();j++)
            {
                if (str.charAt(j)==chrCount)
                {
                    count++;
                }
            }
            if (str.indexOf(chrCount)==i)
            {
                System.out.println(chrCount + "" +count);
            }

        }
    }
}
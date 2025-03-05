package JavaProgrammes;

public class OddEvenCount {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        int odd=0;
        int even=0;

        for (int num: array)
        {
            if (num%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println(even + " and " + odd);




    }


}

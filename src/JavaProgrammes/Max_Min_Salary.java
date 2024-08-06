package JavaProgrammes;

import java.util.Arrays;

public class Max_Min_Salary {
    public static void main(String[] args) {

        int [] salaries = {7,10,16,18,70,3,5};

        int max=1;
        int min=salaries[0];

        for (int i=0;i<salaries.length;i++)
        {
            if (salaries[i]>max)
            {
                max=salaries[i];
            }
            if (min>salaries[i])
            {
                min=salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);
    }
}

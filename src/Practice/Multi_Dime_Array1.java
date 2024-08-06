package Practice;

public class Multi_Dime_Array1 {
    public static void main(String[] args) {
        int [] [] ages = {
                {34, 12, 11},
                {20, 21, 24},
                {21, 23, 26},
        };

        for (int i=0;i<ages.length;i++)
        {
            for (int j=0;j< ages[i].length;j++)
            {
                System.out.print(ages[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }




    }
}

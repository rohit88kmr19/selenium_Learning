package JavaProgrammes;

public class TwoNumSumWithTarget {

    public static void main(String[] args) {

        int a[] ={1,2,4,5,7};

        int target =12;

        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]+a[j]==target)
                {
                    System.out.println("The indices are--->"+i + " " +j);
                    System.out.println("The two numbers are:-->"+a[i] + "+" +a[j] +"=" +target);
                    break;
                }
            }
        }



    }


}

package JavaProgrammes;

public class FibbSeries {
    public static void main(String[] args) {
        fibCal();
    }
    public static void fibCal()
    {
        int n1=0;
        int n2=1;

        System.out.println(n1 + " " +n2);

        for (int i=0; i<=4;i++)
        {
            int n3;
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }

    }

}

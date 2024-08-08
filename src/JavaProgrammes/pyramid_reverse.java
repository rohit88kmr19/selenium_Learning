package JavaProgrammes;

public class pyramid_reverse {
    public static void main(String[] args) {
        int rows=1;
        for (int i=5;i>=rows;i--)
        {
            for (int j=5;j>=i-rows;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


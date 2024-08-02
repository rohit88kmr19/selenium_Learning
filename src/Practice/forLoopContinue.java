package Practice;

public class forLoopContinue {
    public static void main(String[] args) {
        for (int i=0;i<10;i++)
        {
            if(i==5)
            {
                System.out.println("fifth here");
                continue; //5 will not be printed because of conitune statement getting true

            }
            System.out.println("After"+i);
        }
    }
}

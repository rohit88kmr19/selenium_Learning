package Practice;

public class forWithEvenOddLoop {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2==0) //i%2!=0
            {
                System.out.println("The even no are-->:"+i);
                continue;
            }
            System.out.println("Odd-->:" +i);
        }
    }
}

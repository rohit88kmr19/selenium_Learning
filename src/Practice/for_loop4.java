package Practice;

public class for_loop4 {
    public static void main(String[] args) {
        final boolean b1=true;
       // b1=false; //not possible to change the value because of final value.
        for (int i=0;b1;i++)
        {
            System.out.println("Hello");//will rin till infinite loop
        }


    }
}

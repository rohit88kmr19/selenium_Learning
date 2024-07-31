package Practice;

public class swich_cond5 {
    public static void main(String[] args) {
        int itemcode=006;
        switch (itemcode)
        {
            case 001,002,010-> System.out.println("Electronic gadget");
            case 004-> System.out.println("Mechanical gadget");
            default->System.out.println("None");
        }
    }

}

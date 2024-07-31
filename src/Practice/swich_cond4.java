package Practice;

public class swich_cond4 {
    public static void main(String[] args) {
        //For multiple conditions supported, jdk should be greater than 13;
        int itemcode=006;
        switch (itemcode)
        {
            case 001,002,010:
                System.out.println("Electronic gadget");
                break;
            case 004,005,006:
                System.out.println("Mechanical gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}

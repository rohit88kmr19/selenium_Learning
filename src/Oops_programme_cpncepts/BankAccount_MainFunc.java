package Oops_programme_cpncepts;

public class BankAccount_MainFunc {
    public static void main(String[] args) {

         BankAccount_Construc b1 = new BankAccount_Construc();

        System.out.println(b1.bankName);
        System.out.println(b1.bankCode);
        System.out.println(b1.balance);
        b1.printDetails();
        BankAccount_Construc b2 = new BankAccount_Construc("ICICI", 1000, "ICI0001");
        System.out.println(b2.bankName);
        System.out.println(b2.bankCode);
        System.out.println(b2.balance);

        b2.printDetails();





    }
}

package Oops_programme_cpncepts;

public class Bank_mainfunc {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.name="SBI";
        bank2.name="ICICI";
        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank1.balance);
    }
}

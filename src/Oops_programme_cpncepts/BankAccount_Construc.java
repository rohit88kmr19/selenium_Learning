package Oops_programme_cpncepts;

public class BankAccount_Construc {
    String bankName;
    int balance;
    String bankCode;
// The above are called as instance variable.

    BankAccount_Construc()
    {
        bankName="SBI";
        balance=0;
        bankCode="SBI001";
    }

    BankAccount_Construc(String bName , int Bal , String bCode)
    {
        this.bankName=bName;
        this.balance=Bal;
        this.bankCode=bCode;
    }


    void printDetails()
    {
        System.out.println("Bank Name->" +bankName);
        System.out.println("Bank Code->" +bankCode);
        System.out.println("Bank Balance->" +balance);
    }
}

package Oops_programme_cpncepts;

public class Construc_concepts {

    String name;
    long ph_no;

    Construc_concepts()
    {

        System.out.println("I will create once called.");
    }

    Construc_concepts(String nameGiven, long Phone_Number)
    {
        this.name=nameGiven;
        this.ph_no=Phone_Number;
    }
}
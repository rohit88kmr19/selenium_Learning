package Oops_programme_cpncepts;

public class Construc_MainClass {
    public static void main(String[] args) {
        Construc_concepts c0= new Construc_concepts();
        Construc_concepts c1= new Construc_concepts("Rohit", 587845);
        Construc_concepts c2= new Construc_concepts("Kumar", 799451);
        System.out.println(c0.name);
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c0.ph_no);
        System.out.println(c1.ph_no);
        System.out.println(c2.ph_no);


    }
}

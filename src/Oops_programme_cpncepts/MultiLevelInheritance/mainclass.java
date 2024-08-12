package Oops_programme_cpncepts.MultiLevelInheritance;

public class mainclass {
    public static void main(String[] args) {
        //Multilevel Inheritance

        Child c1 = new Child();
        c1.c();
        c1.f();
        c1.gf();
        c1.homeGF();
        c1.homeF();
        c1.homeC();

        System.out.println("----------------");
        new Child().homeGF(); // We can also create the object of class in this way directly without using reference.
        new Child().f();


    }
}

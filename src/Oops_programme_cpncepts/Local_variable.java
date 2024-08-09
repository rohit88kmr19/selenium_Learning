package Oops_programme_cpncepts;



public class Local_variable {

    int age2 = 45;// Instance variable - it can be accessed till the block is closed.

    public static void f1() {
        int e = 10; //local variable - local to the function only can be accessed till the block.
        System.out.println(e);
    }

    void f2() {
        System.out.println(age2);//e not accessible here as e is local to the f1() function but we can access age 2.
    }
}

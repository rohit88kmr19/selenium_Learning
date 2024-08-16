package Oops_programme_cpncepts.PolymorphismConcepts;

public class poly1 {

    // Poly - many , morphism means forms
    //Compile time /Static/MethodOverloading - function with same name but with different arguments.


static int add(int a, int b)
{
    return a+b;
}
static double add(double a, double b)
{
    return a+b;
}

static String add(String a, String b)
{
    return a+b;
}

poly1(){
    System.out.println("i am const");
}
    poly1(int a, int b){
        System.out.println("i am constructor");
    }
    poly1(int a , int b, int c){}
}

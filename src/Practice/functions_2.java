package Practice;

public class functions_2 {
    public static void main(String[] args) {

        //Funcitons without parameter and without return, with parameter and with return type.
        A();

        String name=  B();
        System.out.println(name);

        C("Amit");

    }

       static void A() //no arg and no ret type.
        {
            System.out.println("Without paramter and without return type");

        }
        static  String B()
        {
            return "Pramod";
        }

        static  void C(String name)
        {
            System.out.println("You have shared-->"+name);
        }
}

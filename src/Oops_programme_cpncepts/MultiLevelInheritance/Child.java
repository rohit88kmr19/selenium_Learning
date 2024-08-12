package Oops_programme_cpncepts.MultiLevelInheritance;

public class Child extends Father {

    void homeC()
    {
        System.out.println("Child Home");
    }

    void c()
    {
        //homeF();// We can access the mthods directly as we are extending the father class

        // If the extend keyword will be removed then it can be accesed in this way.
         //new Father().homeF();



        System.out.println("Child");
    }


}

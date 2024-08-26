package Oops_programme_cpncepts.Stat_Keyword;

public class NestedClass {
    public static void main(String[] args) {

        oc c = new oc();

        // we have to access te innner class func and objects now.


    }
}

class oc
{
    Integer a=10;
void OC_m1()
{
    System.out.println("OC_M1");
}
    class InnerClass
    {
        Integer b=20;
        void m2()
        {
            System.out.println(a);
        }
    }
}
package Oops_programme_cpncepts.Stat_Keyword;

public class stat {
    public static void main(String[] args) {
        //Static,block, Data Member, Function, Class
        ATB a1= new ATB("rohit");
        System.out.println(a1.getName());
        System.out.println(ATB.courseName); //Accessing the data,member by using the Class name i.e ATB because its a static.
       ATB.DoAssignment();//Accessing the function by using the Class name i.e ATB because its a static.
    }
}

class ATB
{
    private String name;
    static String courseName= "ATB";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name)
    {
        this.name=name;
    }
    static void DoAssignment()
    {
        System.out.println("Do assignment");
    }

    {
        System.out.println("Hello, I mam static and would be called once you will create an object");
        //purpose. we can write code related to start a website or anything before starting the webautomation or api auto,ation.
    }
static
{
    System.out.println("Class loaded once we will create the class object, it will load once");
}
    {
        System.out.println("I am also here.Will load once the class object will be created .");
    }

static class A
{

}



}
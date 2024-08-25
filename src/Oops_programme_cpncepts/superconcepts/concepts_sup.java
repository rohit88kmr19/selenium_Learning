package Oops_programme_cpncepts.superconcepts;

public class concepts_sup {

    public static void main(String[] args) {
        Car s = new Car();
        s.display();
        s.message();

    }
}
class Car extends Vehicle
{
    private int maxSpeed=281;  //This is present in the child class

    Car()
    {
        //super();// This will call the parent class constructor.At a time multiple super not allowed.
        super(10);
        System.out.println("Child class");
    }

    void display()
    {
        System.out.println(" Car Speed is-->:" +this.maxSpeed);
        System.out.println(" Car Speed is-->:" +super.maxSpeed);
        super.message();// This belongs to parent class
        this.message(); // This belongs to itself means its class.
    }
@Override
    void message()
    {
        System.out.println("This is override message");
    }

}
class Vehicle
{
    public int maxSpeed=180; // This is also present in the parent class.

    Vehicle()
    {
        System.out.println("Parent class");
    }
    Vehicle(int a)
    {
        System.out.println("Parent class"+a);
    }
    void message()
    {
        System.out.println("Helllo vehicle");
    }
}
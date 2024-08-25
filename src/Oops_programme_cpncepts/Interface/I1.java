package Oops_programme_cpncepts.Interface;

import org.w3c.dom.ls.LSOutput;

public class I1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.gear();

    }
}

interface Eng
{
    void start();
    default void m1()
        {
            System.out.println("I am default and can be accessible for everyone");
        }
}
interface  GearBox extends Eng{
    void gear();

    @Override
    default void m1() {
        System.out.println("I am default");
        Eng.super.m1();
    }
}

class Car implements GearBox
{

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void gear() {
        System.out.println("I am gear");

    }
}

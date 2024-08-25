package Oops_programme_cpncepts.PolymorphismConcepts;

public class Overriding {

    // Runtime /Dynamic/Methodoverriding.

    // Here, ref variable of dog will access only bark from the hound class as it will recognize it at the runtime because of same function.
    // Here, overriding means function is same.
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark();

        Hound h1 = new Hound();
        h1.bark();

        Dog ref = new Hound();// Dynamic dipatch/ run time polymorphism
        ref.bark();
    }
}

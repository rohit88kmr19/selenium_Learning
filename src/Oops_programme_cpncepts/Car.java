package Oops_programme_cpncepts;

public class Car {

    String name="rohit";
    boolean tr =true;
    int a;
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = c3;
        System.out.println(c3.name);
        System.out.println(c4.a);


        // Three objects will be created in Heap Area with name c1, c2, c3 and c4 will point to c3.


    }


}

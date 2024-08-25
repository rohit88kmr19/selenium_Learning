package Oops_programme_cpncepts.abstraction;

abstract public class Car extends Engine {

        //Engine, gear  box, keys
    //Tesla is a type of car.


    @Override
    void start() {
        System.out.println("Start Car");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of Gear Box");
    }

    @Override
    void openCar() {
        System.out.println("Open Car");

    }
}

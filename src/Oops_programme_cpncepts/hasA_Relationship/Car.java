package Oops_programme_cpncepts.hasA_Relationship;

public class Car {

    void startTheCar()
    {
        new engine().start();
        new tyre().rolling();


        //This is called has-A relationship as the car has engine and tyres and here we are not using  extends in accesing
        //the methods and attributes.Also, called aggregation.
    }


}

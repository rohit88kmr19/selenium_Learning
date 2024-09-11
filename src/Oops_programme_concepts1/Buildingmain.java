package Oops_programme_concepts1;

public class Buildingmain {
    public static void main(String[] args) {

        BuildingBP dlf = new BuildingBP();

        dlf.name="DLF Pvt Builder";

        dlf.noOfRooms=100;

        dlf.useLift();
        dlf.activities();

        // Objects are created in heap area and String are in String constant pool;

    }
}

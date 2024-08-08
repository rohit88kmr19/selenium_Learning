package Oops_programme_cpncepts;

public class MainBuilding {
    public static void main(String[] args) {
        BuildingBP dlf = new BuildingBP();
        dlf.name= "DLF PVT Builder";
        dlf.noofrooms=100;

        dlf.useLift();
        dlf.activities();

        BuildingBP prestige = new BuildingBP();
        prestige.name= "DLF PVT Builder";
        prestige.noofrooms=100;

        prestige.useLift();
        prestige.activities();
    }
}

// Class Loaders will load
// Then heap area- here objects will be created.
// String constant pool for strings
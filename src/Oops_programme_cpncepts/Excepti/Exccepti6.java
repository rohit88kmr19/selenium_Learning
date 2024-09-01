package Oops_programme_cpncepts.Excepti;

import java.io.File;
import java.io.FileReader;

public class Exccepti6 {
    public static void main(String[] args) {
        String path = "C://a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println("FNE");
        }
    }
}

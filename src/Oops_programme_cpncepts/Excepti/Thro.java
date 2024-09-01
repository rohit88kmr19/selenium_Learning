package Oops_programme_cpncepts.Excepti;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Thro {
    public static void main(String[] args) throws FileNotFoundException,ArithmeticException {

        // Throws - It can be used to handle the exception.It is little different as it attach itself to the method signature rather than
        // the vulnerable code.

        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int a=10/0;
        System.out.println(a);



    }
}

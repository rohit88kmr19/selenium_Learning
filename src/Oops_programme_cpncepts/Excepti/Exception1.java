package Oops_programme_cpncepts.Excepti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
    public static void main(String[] args) {

//        FileInputStream file;
//
//        {
//            try {
//                file = new FileInputStream("c://log.txt");
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }

            //Uncheked- JVM doesn't know.

            try {
                int a=10;
                int c=a/0;
                System.out.println("c");
            } catch (Exception e) {
                System.out.println("Divide by zero");
            }

        }

    }

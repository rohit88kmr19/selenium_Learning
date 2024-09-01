package Oops_programme_cpncepts.CollectionFramewo;

import java.util.Collections;
import java.util.Vector;

public class CF7_lis {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Rohit");
        v.add("Kallu");
        v.add("Mohit");
        System.out.println(v);
        // It is thread safe, synchronised, time consuming and one by one usage.
//
//        Collections.sort(v);
//
//        System.out.println(v);

//            v.remove("Kallu");
//        System.out.println(v);
        v.set(1, "Pinku");

        System.out.println(v);

        String s1 = (String) v.get(1);
        System.out.println(s1);

    }
}

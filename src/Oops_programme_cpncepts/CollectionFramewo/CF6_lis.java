package Oops_programme_cpncepts.CollectionFramewo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CF6_lis {
    public static void main(String[] args) {

        List<String> marks = new ArrayList(); // Here Whatever the datatype will provide then it will take the elements as per that.
        marks.add("Rohit");
        marks.add("Mohit");
        marks.add("onu");
        marks.add("kolu");
        marks.add("Pilu");

        System.out.println(marks);

//        for (Object o: marks)
//        {
//            System.out.println(o);
//        }
        // Iterator

        Iterator<String> its = marks.iterator();
        while(its.hasNext())
        {
            System.out.println(its.next());
        }








    }
}

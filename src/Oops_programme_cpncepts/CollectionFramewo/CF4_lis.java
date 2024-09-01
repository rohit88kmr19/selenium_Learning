package Oops_programme_cpncepts.CollectionFramewo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CF4_lis {

    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);//0
        marks.add(95);//1
        marks.add(89);//2
        marks.add(49);
        marks.add(899);
        marks.add(892);
        System.out.println(marks);
        Collections.sort(marks);// Sorting the arays
        System.out.println(marks);
        Collections.sort(marks, Comparator.reverseOrder());

        System.out.println(marks);




    }




}

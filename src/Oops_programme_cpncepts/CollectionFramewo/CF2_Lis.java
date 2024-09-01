package Oops_programme_cpncepts.CollectionFramewo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CF2_Lis {
    public static void main(String[] args) {

        //List - Linked , Array, Vector and Stack
//        Collection myList3 = new ArrayList();// Dynamic Dispatch
//        List myList = new ArrayList();// Dynamic Dispatch

        ArrayList myList2 = new ArrayList();
        myList2.add("pramod");//0
        myList2.add("Amit");//1
        myList2.add("Lucky");//2
        myList2.add("Moti");//3
        myList2.add("Hello");//4
        myList2.add(123);
        myList2.add(true);

        System.out.println(myList2);
        System.out.println(myList2.size()); //4
        System.out.println(myList2.contains("Amit")); //True
        System.out.println(myList2.contains("Hemlata")); //False

        String s1 = (String) myList2.get(1);
        System.out.println(s1);


    }
}

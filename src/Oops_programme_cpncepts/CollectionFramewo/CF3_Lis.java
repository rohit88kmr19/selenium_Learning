package Oops_programme_cpncepts.CollectionFramewo;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.ArrayList;
import java.util.List;

public class CF3_Lis {
    public static void main(String[] args) {

//        List shopping_list = List.of("Milk" , "Bread", "Butter", "Namkeen");
//        System.out.println(shopping_list);
//
//        System.out.println(shopping_list.size());

       // shopping_list.add("Banana");// It will not be used here to add as add will not work here so we will use add with array list.

        List myList2 = new ArrayList();
        myList2.add("pramod");//0
        myList2.add("Amit");//1
        myList2.add("Lucky");//2
        myList2.add("Moti");//3
        myList2.add("Hello");//4
        myList2.add(123);
        myList2.add(true);
        System.out.println(myList2);
        System.out.println(myList2.size());
        myList2.remove("Hello");
        System.out.println(myList2);
//        myList2.clear();
//        System.out.println(myList2);
        myList2.set(1, "Amit Chottala");
        System.out.println(myList2);

        for (int i=0; i<myList2.size();i++)
        {
            System.out.println(myList2.get(i));
        }

        //Enhanced For loop
        for (Object o:myList2)
        {
            System.out.println(o);
        }

        //Sorting will be applicable in Array List if all the elements are of same data type




    }
}

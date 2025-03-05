package JavaProgrammes;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[]= new int[arr1.length];

//        for (int i=0;i<arr1.length;i++)
//        {
//            arr2[i]=arr1[i];
//        }
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));


    }


}

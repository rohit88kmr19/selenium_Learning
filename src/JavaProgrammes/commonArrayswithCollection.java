package JavaProgrammes;

import javax.swing.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class commonArrayswithCollection {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6, 9};
        int arr2[] = {1, 3, 4, 7, 9};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new LinkedHashSet<>();

        for (int n : arr1) {
            set1.add(n);
        }

        for (int n : arr2) {
            if (set1.contains(n)) {
                common.add(n); // LinkedHashSet maintains insertion order
            }
        }

        System.out.println("Common Elements:");
        for (int n : common) {
            System.out.print(n + " ");
        }
    }
}
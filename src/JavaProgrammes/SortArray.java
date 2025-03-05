package JavaProgrammes;

public class SortArray {

    public static void main(String[] args) {

        int arr[] = { 48, 89, 89, 96, 04,64,68,79,90,99,98,98,9876};

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];//48 ,
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");

            int no =123;
            String str =String.valueOf(no);


        }
    }
}
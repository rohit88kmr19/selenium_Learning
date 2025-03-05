package JavaProgrammes;

public class CommonArrays {

    public static void main(String[] args) {


        int arr1[] = {1, 2, 4, 5, 6, 9};
        int arr2[] = {1, 3, 4, 7, 9};
        int arr3[] = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean isDuplicate = false; //will check for duplicacy of element
                    for (int k = 0; k <index; k++) {
                        if (arr3[k] == arr1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        arr3[index++] = arr1[i];
                    }

                }
            }
        }
        System.out.println("Common Elements");
            for (int i = 0; i < index; i++) {
                System.out.print(arr3[i] + " ");
            }
        }
    }

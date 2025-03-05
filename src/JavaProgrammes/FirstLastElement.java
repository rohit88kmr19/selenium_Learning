package JavaProgrammes;

public class FirstLastElement {

    public static void main(String[] args) {

        int arr[] = {1, 2, 35, 6, 9};

        int len = arr.length;

        if (len > 0) {
            int fl = arr[0];

            int le = arr[len - 1];

            System.out.println(fl);
            System.out.println(le);

        } else {
            System.out.println("The array is empty");
        }


    }


}

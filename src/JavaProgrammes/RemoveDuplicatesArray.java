package JavaProgrammes;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {

        int arr[] = {1,1,2,7,8,9};

        int len =arr.length;
        System.out.println("The duplicate characters are-->");
        for (int i=0;i<len;i++)
        {
            boolean isDuplicate=false;
            for (int j=i+1;j<len;j++)
            {
                if (arr[i]==arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate)
            {
                System.out.print(arr[i]);
            }
        }

    }

}

package JavaProgrammes;

public class MissingNoArray {

    public static void main(String[] args) {

        int [] a = {1,2,4,5,6,7};

        int len =a.length;

        int totalSum= (len+1)*(len+2)/2;
        int actualSum=0;
        for(int num:a)

        {
            actualSum+=num;
        }

        int missingNum=totalSum-actualSum;

        System.out.println(missingNum);
    }
}

package JavaProgrammes;

public class SumOnlyNumbersInsteadofLettersAndSpecialCharacters {

    public static void main(String[] args) {

        String [] array = {"5", "6", "9", "a", "1", "6", "#", "3"};

        int sum=0;
        for (String num: array)
        {
            try {
                int number = Integer.parseInt(num);
                sum=sum+number;
            } catch (NumberFormatException e) {
                continue;
            }

        }
        System.out.println(sum);

    }
}
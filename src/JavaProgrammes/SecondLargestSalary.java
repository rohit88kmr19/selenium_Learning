package JavaProgrammes;

public class SecondLargestSalary {

    public static void main(String[] args) {

        int a[] = {1, 3, 46, 7};

        int highSal= Integer.MIN_VALUE;
        int secHigh = Integer.MIN_VALUE;

        for (int salary : a)
        {
            if (salary>highSal)
            {
                secHigh=highSal;
                highSal=salary;
            } else if (salary>secHigh && salary<highSal) {

                secHigh=salary;
                
            }
        }
        System.out.println(secHigh);

    }
}

package Oops_programme_cpncepts.Single_Inheritance;

public class Main_Father_Son {
    public static void main(String[] args) {

        Son_SH s= new Son_SH();

        s.bhk3();
        s.bhk2();

        Father_SH f = new Father_SH();
        f.bhk2(); // Father cannot access bhk3() as father doesnot have access to son class.



    }
}

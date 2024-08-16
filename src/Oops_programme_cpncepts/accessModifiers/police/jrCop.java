package Oops_programme_cpncepts.accessModifiers.police;

public class jrCop {

    public static void main(String[] args) {

        cop c1= new cop(10);
        cop c2= new cop("rohit");
        System.out.println(c2.idCard);
        System.out.println(c1.gun);
        c1.canIShoot();
    }
}

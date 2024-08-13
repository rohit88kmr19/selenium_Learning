package Oops_programme_cpncepts.accessModifiers.police;

public class cop {
   public int gun;
    private String idCard;

    public cop(int gunc)
    {
        this.gun=gunc;
    }

    protected void canIShoot()
    {
        System.out.println("Yes, You can !!");
    }

}

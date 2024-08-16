package Oops_programme_cpncepts.accessModifiers.police;

public class cop {
   public int gun;
    protected String idCard;

    public cop(int gunc)
    {
        this.gun=gunc;
    }
public cop(String idCardc)
{
    this.idCard=idCardc;
}
     protected void canIShoot()
    {
        System.out.println("Yes, You can !!");
    }

}

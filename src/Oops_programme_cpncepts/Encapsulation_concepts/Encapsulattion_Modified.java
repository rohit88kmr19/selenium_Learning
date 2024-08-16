package Oops_programme_cpncepts.Encapsulation_concepts;

public class Encapsulattion_Modified {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin1 = new VWOLogin1("admin", "admin123");
        System.out.println("Username before changing-->" +vwoLogin1.getUsername1());
        vwoLogin1.setUsername1788878787("rohit123");
        System.out.println("Username after setting the username-->" +vwoLogin1.getUsername1());

        System.out.println("Passwword before changing-->" +vwoLogin1.getPassword1());
        vwoLogin1.setPassword1("herockpr", false);
        System.out.println("Password after setting the password-->" +vwoLogin1.getPassword1());
//
//        vwoLogin1.password1="123";
//        System.out.println("Password after changing-->"+vwoLogin1.password1);

    }
}
class VWOLogin1
{
    private String username1;
    private String password1;

    // We need to create the function to allow the data members.


    public String getUsername1() {
        return username1;
    }

    public void setUsername1788878787(String username12) {
        this.username1 = username12;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password12, boolean isAuth) {
        if (isAuth)
        {
            this.password1 = password12;
        }
       else
        {
            System.out.println("Not allowed");
        }
    }

    public VWOLogin1(String usernamec1, String passwordc1) {
        this.username1 = usernamec1;
        this.password1 = passwordc1;
    }
}


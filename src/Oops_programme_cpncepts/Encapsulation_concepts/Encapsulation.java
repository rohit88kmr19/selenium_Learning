package Oops_programme_cpncepts.Encapsulation_concepts;

public class Encapsulation {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "admin@123");
        System.out.println("Password before changing-->" +vwoLogin.password);
        vwoLogin.password="123";
        System.out.println("Password after changing-->"+vwoLogin.password);
    }
}

class VWOLogin
{
    public String username;
    public String password;

    public VWOLogin(String usernamec, String passwordc) {
        this.username = usernamec;
        this.password = passwordc;
    }
}

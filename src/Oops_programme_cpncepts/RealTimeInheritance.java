package Oops_programme_cpncepts;

public class RealTimeInheritance {

    public static void main(String[] args) {
        BaseClass t1 = new TestCase1();// Dynamic dispatch and runtime polymorphism.
        t1.setBrowser("Opera", false);
        t1.openBrowser();
        t1.openBrowser("Edge");
    }
}

class TestCase1 extends BaseClass {
    // This is single inheritance.
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser("Opera",false);
    }
}
class BaseClass {

    private String browser;

    BaseClass()
    {
        System.out.println("I am default");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }
        else {
            System.out.println("Not Allowed");
        }
    }
            void openBrowser()
    {
        System.out.println("Opera Browser");
    }
            void openBrowser(String browserName )
            {
                System.out.println("Open Browser!!->"+browserName);
            }

}
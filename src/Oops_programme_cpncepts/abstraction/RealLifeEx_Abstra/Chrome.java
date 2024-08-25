package Oops_programme_cpncepts.abstraction.RealLifeEx_Abstra;

public class Chrome extends BaseClass{


    @Override
    String openBrowser(String browser) {
        System.out.println("Opening the Chrome");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the Chrome");
        return "";
    }
}

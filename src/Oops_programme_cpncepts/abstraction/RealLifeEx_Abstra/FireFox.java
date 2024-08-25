package Oops_programme_cpncepts.abstraction.RealLifeEx_Abstra;

public class FireFox extends BaseClass{


    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Firefox");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close the firefox");
        return "";
    }
}


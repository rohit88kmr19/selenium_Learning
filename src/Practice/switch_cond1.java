package Practice;

import java.util.Scanner;

public class switch_cond1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName) {
            case "chrome":
                System.out.println("Execute the chrome browser ");
                break;
            case "firefox":
                System.out.println("Execute the firefox browser");
                break;
            case "edge":
                System.out.println("Execute the edge browser");
                break;

            default:
                System.out.println("Nothing will display");
                break;
        }
        System.out.println("Enter the correct browser name!!");
    }
}
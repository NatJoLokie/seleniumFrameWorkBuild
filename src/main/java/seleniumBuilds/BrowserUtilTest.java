package seleniumBuilds;

public class BrowserUtilTest {

    public static String browserName = "chrome";

    public static void main(String[] args) {

        BrowserUtil brut = new BrowserUtil();
// To test if Browser is launched
        brut.launchBrowser(browserName);

// To test if URL exception is throwing when http/https is not provided
//        brut.launchURL("www.google.com");

// To test if URL is opened successfully
        brut.launchURL("https://www.google.com");

        String pageTitle = brut.getPageTitle();
        if (pageTitle.equals("Google")) {
            System.out.println("Title - Pass");
        } else {
            System.out.println("Title - Fail");
        }

        String pageUrl = brut.getPageURL();
        if (pageUrl.contains("google.com")) {
            System.out.println("URL - Pass "+pageUrl);
        } else {
            System.out.println("URL - Fail "+pageUrl);
        }

        brut.closeBrowser();

        brut.quitBrowser();


    }

}

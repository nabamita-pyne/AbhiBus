package pageRepository;

public class GenericPage {
    private Webdriver driver= null;
    public void open (String url) {
        //driver.get("https://www.google.com/");
       System.setProperty("webdriver.chrome.driver",C:\Users\User\Downloads\chromedriver_win32 (1));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
    }
    driver.manage().deleteAllCookies();
}

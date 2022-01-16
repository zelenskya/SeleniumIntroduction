import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {
    public static void main(String[] args) {
        //driver's version should be up to date with Chrome's one
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver is an interface; ChromeDriver implements WebDriver
        WebDriver driver_chrome = new ChromeDriver();

        //region Firefox
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver driver_firefox = new FirefoxDriver();
        //endregion

        //region Edge
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Selenium_Course\\edgedriver\\msedgedriver.exe");
        //WebDriver driver_edge = new EdgeDriver();
        //endregion

        driver_chrome.get("https://www.ozon.ru/");
        System.out.println(driver_chrome.getTitle());
        System.out.println(driver_chrome.getCurrentUrl());
        //driver.close();
        driver_chrome.quit();
    }
}

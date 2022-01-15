import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {
    public static void main(String[] args) {
        //driver's version should be up to date with Chrome's one
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver is an interface; ChromeDriver implements WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ozon.ru/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        driver.quit();
    }
}

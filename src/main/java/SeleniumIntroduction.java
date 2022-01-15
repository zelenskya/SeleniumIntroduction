import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver is an interface; ChromeDriver implements WebDriver
        WebDriver driver = new ChromeDriver();
    }
}

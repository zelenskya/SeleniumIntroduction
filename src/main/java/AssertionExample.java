import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class AssertionExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        String deliveryDestination = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).getText();
        System.out.println(deliveryDestination);
        Assert.assertEquals(deliveryDestination, "Russian Federation");
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
        Thread.sleep(5000);
        driver.quit();


    }
}

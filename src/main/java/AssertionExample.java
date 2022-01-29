import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import java.time.Duration;

public class AssertionExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://amazon.com");
        String deliveryDestination = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).getText();
        System.out.println(deliveryDestination);
        Assert.assertEquals(deliveryDestination, "Russian Federation");
        driver.quit();
    }
}

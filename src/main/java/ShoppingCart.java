import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String[] requiriedItems = new String[]{"Молоко безлактозное Parmalat Comfort 1.8 % 1л, Россия"};
        List requiriedItemsList = Arrays.asList(requiriedItems);

        driver.get("https://av.ru/");
        //select city
        driver.findElement(By.xpath("//button[contains(@class,'b-region-modal__button')]")).click();
        //enter product
        driver.findElement(By.xpath("//input[contains(@class,'b-header-search__input')]")).sendKeys("parmalat comfort");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        List<WebElement> itemsAvailable = driver.findElements(By.xpath("//div[@class='product-info_name']"));
        for (int i=0;i<itemsAvailable.size();i++){
            String itemName = itemsAvailable.get(i).getText();
            if (requiriedItemsList.contains(itemName)){
                driver.findElements(By.xpath("//div[contains(@class,'product-info__buy-btn')]")).get(i).click();
                break;
            }
        }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //region static drop-down, search categories
        /*driver.get("http://amazon.com");
        WebElement webeltCategoriesList = driver.findElement(By.id("searchDropdownBox"));
        Select categoriesList = new Select(webeltCategoriesList);
        categoriesList.selectByIndex(1);
        System.out.println(categoriesList.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        categoriesList.selectByVisibleText("Books");
        System.out.println(categoriesList.getFirstSelectedOption().getText());*/
        //endregion

        //region dynamic drop-down, a number of passengers
        driver.get("http://aviasales.ru");
        /*driver.findElement(By.xpath("//*[@class='container_c4b10b6 additional-fields__dropdown-container']")).click();
        driver.findElement(By.xpath("//div[@data-test-id='passengers-adults-field']//a[contains(@class,'--increment')]")).click();
        //driver.findElement(By.xpath("//div[@data-test-id='passengers-children-field']//a[contains(@class,'--increment')]")).click();
        driver.findElement(By.xpath("(//a[contains(@class,'additional-fields__passenger-control --increment')])[2]")).click();
        driver.findElement(By.xpath("//div[@data-test-id='passengers-infants-field']//a[contains(@class,'--increment')]")).click();
        driver.findElement(By.xpath("//button[@data-test-id='form-submit']")).click();*/
        System.out.println(driver.findElement(By.xpath("//label[@for='clicktripz']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//label[@for='clicktripz']")).isEnabled());
        //Assert.assertTrue(driver.findElement(By.xpath("//label[@for='clicktripz']")).isSelected());
        driver.findElement(By.xpath("//label[@for='clicktripz']")).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='clicktripz']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//label[@for='clicktripz']")).isEnabled());
        driver.findElement(By.xpath("//label[@for='clicktripz']")).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='clicktripz']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//label[@for='clicktripz']")).isEnabled());
        Thread.sleep(1000);
        Assert.assertFalse(driver.findElement(By.xpath("//label[@class='of_input_checkbox__label']")).isSelected());
        Assert.assertEquals(driver.findElement(By.xpath("//label[@class='of_input_checkbox__label']")).getText(),"Открыть Booking.com в новом окне");
        //endregion

        //region context-driven drop-down, search field
        /*driver.get("http://amazon.com");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> searchElements = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        for (WebElement item:searchElements){
            if (item.getText().equals("indoor grill")){
                item.click();
                break;
            }
        }
        Thread.sleep(2000);*/
        //endregion

    }
}

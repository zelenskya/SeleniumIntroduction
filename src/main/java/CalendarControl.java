import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarControl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("http://aviasales.ru");
        //select current date
        driver.findElement(By.xpath("//div[@data-test-id='departure-date-field']")).click();
        driver.findElement(By.xpath("//div[@class='calendar__day-cell today']")).click();
        Thread.sleep(1000);
        String selectedDepatureDate = driver.findElement(By.xpath("//input[@data-test-id='departure-date-input']")).getAttribute("value");
        Assert.assertEquals(selectedDepatureDate, getCurrentDateFormatted());
    }

    private static String getCurrentDateFormatted() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, new Locale("ru"));

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd " + month + ", E");
        return (formatForDateNow.format(date).toLowerCase());
    }
}

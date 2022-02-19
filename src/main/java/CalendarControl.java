import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CalendarControl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("http://aviasales.ru");
        driver.findElement(By.xpath("//div[@data-test-id='departure-date-field']")).click();
        Thread.sleep(3000);
        //select current date
        driver.findElement(By.xpath("//div[@class='calendar__day-cell today']")).click();
        Thread.sleep(3000);
        String selectedDepatureDate = driver.findElement(By.xpath("//input[@data-test-id='departure-date-input']")).getAttribute("value");
        Assert.assertEquals(selectedDepatureDate, getCurrentDateFormatted());
        //select current+3 date
        Thread.sleep(3000);
        List<WebElement> listDepatureDates = driver.findElements(By.xpath("//div[@class='calendar-day']"));
        listDepatureDates.get(3).click();
        String selectedReturnDate = driver.findElement(By.xpath("//input[@data-test-id='return-date-input']")).getAttribute("value");
        Assert.assertEquals(selectedReturnDate, getDateFormatted(5));
    }

    private static String getCurrentDateFormatted() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, new Locale("ru"));

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd " + month + ", E");
        return (formatForDateNow.format(date).toLowerCase());
    }

    private static String getDateFormatted(int days){
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        date = c.getTime();
        String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, new Locale("ru"));
        SimpleDateFormat formatForDate = new SimpleDateFormat("dd " + month + ", E");
        return (formatForDate.format(date).toLowerCase());
    }
}

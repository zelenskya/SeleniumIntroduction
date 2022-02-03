import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;

public class SeleniumIntroduction {
    public static void main(String[] args) throws InterruptedException {
        //driver's version should be up to date with Chrome's one
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver is an interface; ChromeDriver implements WebDriver
        WebDriver driver_chrome = new ChromeDriver();
        //wait for an object appeared on the page
        driver_chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver_chrome.manage().window().maximize();
        //region Firefox
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver driver_firefox = new FirefoxDriver();
        //endregion

        //region Edge
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Selenium_Course\\edgedriver\\msedgedriver.exe");
        //WebDriver driver_edge = new EdgeDriver();
        //endregion

        driver_chrome.get("https://www.ozon.ru/");
        //driver_chrome.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver_chrome.getTitle());
        System.out.println(driver_chrome.getCurrentUrl());

        String page_title = driver_chrome.getTitle();

        //region Arrays & Strings
        /*String[] splitted_title = page_title.split(" ");
        for (int i=0; i<splitted_title.length; i++){
            System.out.println(splitted_title[i]);
        };

        ArrayList<String> splitted_title_arr = new ArrayList<String>();
        for (int i=splitted_title.length-1; i>=0; i--){
             splitted_title_arr.add(splitted_title[i]);
        };
        System.out.println(splitted_title_arr.get(0));*/
        //endregion

        //driver_chrome.findElement(By.id("inputUsername")).sendKeys("qwerty");
        //driver_chrome.findElement(By.name("text")).sendKeys("qwerty");
        /* Use SelectorsHub plugin to get CSS Selector value */
        //driver_chrome.findElement(By.cssSelector("input[placeholder='Искать на Ozon']")).sendKeys("qwerty");
        //System.out.println(driver_chrome.findElement(By.className("ui-o4")).getText());
        /*driver_chrome.findElement(By.linkText("Ozon Travel")).click();
        Thread.sleep(5000);
        driver_chrome.findElement(By.xpath("//input[@name='text']")).sendKeys("xpath");
        driver_chrome.findElement(By.xpath("//form/button")).click();
        Thread.sleep(5000);
        //click TOP Fashion
        driver_chrome.findElement(By.xpath("//*[@id=\"layoutPage\"]/div[1]/header/div[2]/div/ul/li[1]/a")).click(); //just copy xpath from browser's inspect code
        Thread.sleep(5000);
        //click Premium
        driver_chrome.findElement(By.xpath("//*[@id=\"layoutPage\"]/div[1]/header/div[2]/div/ul/li[2]/a")).click();
        Thread.sleep(5000);
        driver_chrome.findElement(By.cssSelector("input[name*='te']")).sendKeys("regular expressions");
        */Thread.sleep(5000);
        //driver_chrome.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/div[1]/div/div")).click(); //click Войти

        /*String text = driver_chrome.findElement(By.xpath("//*[@id=\"layoutPage\"]/div[1]/div[1]/div/ul/li[1]/div/a/span")).getText();
        String[] textArray = text.split(" ");*/

        //Absolute xpath (Войти) + following-sibling (Заказы)
        System.out.println(driver_chrome.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div[4]/div[1]")).getText());
        System.out.println(driver_chrome.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[1]/div[4]/div[1]/following-sibling::div[1]")).getText());

        //driver_chrome.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[4]/div[1]/div/div")).findElement(By.className("u1-b2")).click();
        //button tabindex="0" type="button" class="u1-b2"
        Thread.sleep(3000);
        //driver.close();
        driver_chrome.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;

public class SeleniumIntroduction {
    public static void main(String[] args) {
        //driver's version should be up to date with Chrome's one
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Selenium_Course\\chromedriver\\chromedriver.exe");
        //WebDriver is an interface; ChromeDriver implements WebDriver
        WebDriver driver_chrome = new ChromeDriver();
        driver_chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

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
        driver_chrome.findElement(By.cssSelector("input[placeholder='Искать на Ozon']")).sendKeys("qwerty");


        //driver.close();
        driver_chrome.quit();
    }
}

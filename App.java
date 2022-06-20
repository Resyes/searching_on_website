

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    
    static JavascriptExecutor jse;
    public static void main(String[] args) throws Exception {
        
        
        System.setProperty("webdriver.chrome.driver", "C:\\Damian\\Selenium\\projekt3\\ project3\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1000)");
       

        driver.findElement(By.xpath("//span[contains(@class,'a-size-base a-color-base') and contains(text(),'English')]")).click();
        Thread.sleep(2000);


       
        
        
        //driver.quit();
    }

    
}


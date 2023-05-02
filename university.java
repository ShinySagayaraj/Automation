package project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class university {
public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     //Thread.sleep(3000);
     driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
     WebElement click = driver.findElement(By.xpath("//p[.='CLICK ME!']/../.."));
  //  wait.until(ExpectedConditions.elementToBeClickable(click));
     //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   //  Thread.sleep(8000);
   
      // driver.findElement(By.linkText("CLICK ME!")).click();
     driver.findElement(By.xpath("//button[.='Close']")).click();
    
   
}
}

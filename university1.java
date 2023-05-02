package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class university1 {
   public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");
     Actions act = new Actions(driver);
       WebElement click = driver.findElement(By.xpath("//p[.='CLICK ME!']/../.."));
      // act.moveToElement(click).perform();
      // act.doubleClick(click).perform();
       
}
}

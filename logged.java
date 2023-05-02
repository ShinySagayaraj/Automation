package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logged {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver  driver =new ChromeDriver();
       driver.get("https://qaemsadmin.azurewebsites.net/");
       Thread.sleep(4000);
       driver.findElement(By.className("form-control")).sendKeys("steyn");
       Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password@123456");
       Thread.sleep(4000);
       driver.findElement(By.xpath("//button[.='Login']")).click();
       Thread.sleep(4000);
       driver.close();
}
}

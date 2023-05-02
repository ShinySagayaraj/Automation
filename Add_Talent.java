package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Add_Talent {

	public static void main(String[] args) throws InterruptedException, AWTException {
		   WebDriver  driver =new ChromeDriver();
	       driver.get("https://qaemsadmin.azurewebsites.net/");
	        //Thread.sleep(4000);
	       driver.findElement(By.className("form-control")).sendKeys("steyn");
	        //Thread.sleep(4000);
	       driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password@123456");
	       Thread.sleep(4000);
	       driver.findElement(By.xpath("//button[.='Login']")).click();
	       Thread.sleep(8000);
	       WebElement select_shoot = driver.findElement(By.id("ddlShooting"));
	       Select shoot = new Select(select_shoot);
	       shoot.selectByVisibleText("RABS PROJECT, LOC 2, 04/12/2023");
	       Thread.sleep(8000);
	       driver.findElement(By.xpath("//button[text()=' Add Talents']")).click();
	       Thread.sleep(8000);
	       Actions act = new Actions(driver);
	       WebElement Hashtag = driver.findElement(By.xpath("(//div[@class='react-grid-Cell__value'])[1]"));
	       act.doubleClick(Hashtag).sendKeys("12").perform();
	        // Actions act2 = new Actions(driver);
//	         Robot rob = new Robot();
//		        Thread.sleep(3000);
//		        rob.keyPress(KeyEvent.VK_KP_RIGHT);
	       WebElement calltime = driver.findElement(By.xpath("(//div[@class='react-grid-Cell__value'])[2]"));
	          //Thread.sleep(4000);
	       //act.moveToElement().perform();
	       Thread.sleep(4000);
	       act.doubleClick(calltime).sendKeys("09.00 PM").perform();
	        // Actions act3 = new Actions(driver);
	       WebElement firstname = driver.findElement(By.xpath("(//div[@class='react-grid-Cell__value'])[3]"));
	       Thread.sleep(4000);
	       act.doubleClick(firstname).sendKeys("Sanjuu").perform();
	       WebElement lastname = driver.findElement(By.xpath("(//div[@class='react-grid-Cell__value'])[4]"));
	       Thread.sleep(4000);
	       act.doubleClick(lastname).sendKeys("Sanjiii").perform();
	       WebElement phone = driver.findElement(By.xpath("(//div[@class='react-grid-Cell__value'])[5]"));
	       Thread.sleep(4000);
	       act.doubleClick(phone).sendKeys("1234567890").perform();
	       WebElement email = driver.findElement(By.xpath("(//div[@class='react-grid-Cell__value'])[6]"));
	       Thread.sleep(4000);
	       act.doubleClick(email).sendKeys("veeshu@gmail.com").perform();
	       driver.findElement(By.id("role")).sendKeys("Employeee");
	       driver.findElement(By.id("rate")).sendKeys("9");
	       Thread.sleep(9000);
	       WebElement job = driver.findElement(By.id("jobTitle"));
	       Select jobtitle = new Select(job);
	       jobtitle.selectByVisibleText("Model");
	       Thread.sleep(9000);
	       WebElement radio = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[9]"));
	       radio.click();
	       WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']"));
	       submit.click();
	       //driver.close();
	}
}

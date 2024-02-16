package com.flipcart.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest {
	
	
@Test
public void RegisterWithMandatoryFeild() throws InterruptedException {
	
WebDriver driver = new ChromeDriver ();	
driver.get("https://www.amazon.in/");	
//use actions class to hover on webElement 
WebElement signIn=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
Actions act = new Actions(driver);
act.moveToElement(signIn).build().perform();
driver.findElement(By.xpath("//a[contains(text(),'Start here.')]")).click();
Thread.sleep(5000);
driver.findElement(By.id("ap_customer_name")).sendKeys("Priyanka Kambale")	;
driver.findElement(By.id("ap_phone_number")).sendKeys("8421673609")	;
driver.findElement(By.id("ap_password")).sendKeys("Priyanka@123")	;	
driver.findElement(By.id("continue")).click();
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

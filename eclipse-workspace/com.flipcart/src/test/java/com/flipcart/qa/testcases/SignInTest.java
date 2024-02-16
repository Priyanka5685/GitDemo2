package com.flipcart.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
	WebDriver driver;
@BeforeMethod
public void setUp() {
	
driver=initiliseBrowser()	;
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();	
		
}
	
@AfterMethod
public void tearDown() {
	driver.quit();
}
	
	
	
	
@Test(priority=1)
public void registerWithMandatoryInputs() {
	
driver.findElement(By.id("ap_email")).sendKeys("8421673609");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("Priyanka@123");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();

boolean  message = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();

Assert.assertTrue(message);

}
	
@Test(priority=2)
public void registerWithallFeilds() {
	
driver.findElement(By.id("ap_email")).sendKeys("8421673609");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("Priyanka@123");
driver.findElement(By.xpath(" //input[@id='signInSubmit']")).click();

boolean  message = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
Assert.assertTrue(message);
	
	
}
	
	
@Test(priority=3)
public void registerWithblankInputs() {
	
	
driver.findElement(By.id("ap_email")).sendKeys("");
driver.findElement(By.id("continue")).click();

String errorText= driver.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText();		

 Assert.assertEquals(errorText, "Enter your email or mobile phone number");

}
	
	
	
	





























}

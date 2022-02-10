package com.POMImplement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.DDT.UserDetails;
import com.POM.LoginPage;
import com.logging.LoggerClass;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.IOException;

public class Login2 {

		static WebDriver driver;
		public Login2(WebDriver driver) {
			this.driver=driver;
		}
		
		
		
		
		
		
		public void loginClicked() {
			LoggerClass.printDebug(driver.getCurrentUrl());
			
			
			driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
			WebElement enterName = driver.findElement(By.name("email"));
//			By enterpass = with.By.tagName("input").be
			WebElement enterPass = driver.findElement(with(By.tagName("input")).below(enterName)); 
			WebElement submitLogin = driver.findElement(with(By.tagName("input")).below(enterPass));
			try {
				enterName.sendKeys(UserDetails.getUserName());
				LoggerClass.printDebug("Getting Username...");
			} catch (IOException e) {
				LoggerClass.printError("Username not found");
			}
			try {
				enterPass.sendKeys(UserDetails.getPassword());
				LoggerClass.printDebug("Getting Password...");
			} catch (IOException e) {
				LoggerClass.printError("Password not found");
			}
			submitLogin.click();
			LoggerClass.printDebug("Logged in Successfully");
}
		
}

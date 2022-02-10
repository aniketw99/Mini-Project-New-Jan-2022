package com.POMImplement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import com.POM.ProductsPage;
import com.logging.LoggerClass;

public class Logout {
	
	static WebDriver driver;
	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	
	public void logoutsuccess() {
		Login2 login2=new Login2(driver);
		login2.loginClicked();
		
		try {
			ProductsPage.logout(driver).click();
			LoggerClass.printInfo("Logout successful");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Logout");
		}
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/p/a")).click();
		String str1=driver.getCurrentUrl();
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
	    newWindow.get(str1);
	    LoggerClass.printInfo("New window opened for Login");
		
	}

}

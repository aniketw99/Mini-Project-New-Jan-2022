package com.POMImplement;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.RegisterUser;
import com.DDT.WebDriverProperties;
import com.POM.CartPage;
import com.POM.FirstPage;
import com.POM.ProductsPage;
import com.POM.SignUpPage;
import com.POMImplement.SignUp;
import com.logging.LoggerClass;

public class AddtoCart {
	static WebDriver driver;
	public AddtoCart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addedtocart() throws IOException {
		Login2 login2=new Login2(driver);
		login2.loginClicked();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		try {
			ProductsPage.prod_Canon_EOS(driver).click();
			LoggerClass.printDebug("Added item to cart");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Looad Products");
		}
		try {
			ProductsPage.prod_Sony_DSLR(driver).click();
			LoggerClass.printDebug("Added item to cart");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Products");
		}
		try {
			ProductsPage.cartButton(driver).click();
			LoggerClass.printDebug("Cart opened");
		} catch (IOException e) {
			LoggerClass.printError("Failed to Products");
		}
		try {
			CartPage.confirmOrder(driver).click();
			LoggerClass.printDebug("order confirmed");
		} catch (IOException e) {
			LoggerClass.printError("Failed to confirm Products");
		}
		
		LoggerClass.printDebug("Test Case Passed");
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		Date date = Calendar.getInstance().getTime();
		DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String name = dateformat.format(date);
		name = name.replace(":", "");
		name = name.replace("-", "");
		File dest = new File(name + ".png");
		FileUtils.copyFile(src, dest);
	}
}

package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.RegisterUser;
import com.DDT.UserDetails;
import com.DDT.WebDriverProperties;
import com.POM.CartPage;
import com.POM.FirstPage;
import com.POM.LoginPage;
import com.POM.ProductsPage;
import com.POM.SignUpPage;
import com.POMImplement.AddtoCart;
import com.logging.LoggerClass;

public class TC_Verify_AddToCart {
	WebDriver driver, driver1;

	@Test
	public void VerifyAddingToCart() throws IOException {

		AddtoCart ad=new AddtoCart(driver);
		ad.addedtocart();

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver = WebDriverProperties.setChromeDriverProperty();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

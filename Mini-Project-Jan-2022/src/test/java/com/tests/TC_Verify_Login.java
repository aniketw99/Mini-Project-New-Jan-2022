package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.UserDetails;
import com.DDT.WebDriverProperties;
import com.POM.FirstPage;
import com.POM.LoginPage;

import com.POMImplement.Login2;
import com.logging.LoggerClass;

public class TC_Verify_Login {
	WebDriver driver;

	@Test
	public void f() {
		Login2 login2=new Login2(driver);
		login2.loginClicked();
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver = WebDriverProperties.setChromeDriverProperty();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}

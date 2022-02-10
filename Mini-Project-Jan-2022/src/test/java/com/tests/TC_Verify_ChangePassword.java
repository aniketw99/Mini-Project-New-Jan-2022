package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

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
import com.POM.SettingsPage;
import com.POM.SignUpPage;
import com.POMImplement.ChangePass;
import com.logging.LoggerClass;

public class TC_Verify_ChangePassword {
	WebDriver driver, driver1;

	@Test
	public void VerifyPasswordChange() {

		ChangePass cp=new ChangePass(driver);
		cp.changePasswd();

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

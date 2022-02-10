package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.DDT.RegisterUser;
import com.DDT.WebDriverProperties;
import com.POM.FirstPage;
import com.POM.SignUpPage;
import com.POMImplement.SignUp;
import com.logging.LoggerClass;


public class TC_Verify_SignUp {
	WebDriver driver,driver1;
	
  @Test
  public void SignUpVerified() throws IOException {
	  
	  SignUp sp=new SignUp(driver);
	  sp.signupClicked();

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

package com.POMImplement;
import com.DDT.RegisterUser;
import com.DDT.UserDetails;
import com.POM.*;
import com.logging.LoggerClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class SignUp {
	static WebDriver driver1;
		public SignUp(WebDriver driver) {
			this.driver1=driver;
		}
	
		public static void signupClicked() throws IOException {
			String str=UserDetails.getUrl2();
			WebDriver driver = driver1.switchTo().newWindow(WindowType.TAB);
			driver.get(str);
			
			try {
				SignUpPage.nameRegister(driver).sendKeys(RegisterUser.getUserName());
				LoggerClass.printDebug("username entered Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to enter user name");
			}
			  try {
				SignUpPage.emailregister(driver).sendKeys(RegisterUser.getEmail());
				LoggerClass.printDebug("useremail entered Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to enter user email");
			}
			  try {
				SignUpPage.passwordRegister(driver).sendKeys(RegisterUser.getPassword());
				LoggerClass.printDebug("password entered Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to enter user passwd");
			}
			  try {
				SignUpPage.contactRegister(driver).sendKeys(RegisterUser.getContact());
				LoggerClass.printDebug("user comtact entered Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to enter user contact");
			}
			  try {
				SignUpPage.CityRegister(driver).sendKeys(RegisterUser.getCity());
				LoggerClass.printDebug("user city entered Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to enter user city");
			}
			  try {
				SignUpPage.addressRegister(driver).sendKeys(RegisterUser.getAddress());
				LoggerClass.printDebug("user address entered Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to enter user address");
			}
			  try {
				SignUpPage.submitButtonSignUp(driver).click();
				LoggerClass.printInfo("User created Successfully");
			} catch (IOException e) {
				LoggerClass.printError("Failed to create user registration");
			}
			
			
		}
}

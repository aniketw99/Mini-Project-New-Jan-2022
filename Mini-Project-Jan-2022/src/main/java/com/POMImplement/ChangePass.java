package com.POMImplement;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.DDT.UserDetails;
import com.POM.ProductsPage;
import com.POM.SettingsPage;
import com.logging.LoggerClass;

public class ChangePass {
	
	static  WebDriver driver;
	public ChangePass (WebDriver driver) {
		this.driver=driver;
	}
	
	public void changePasswd() {
		Login2 login2=new Login2(driver);
		login2.loginClicked();
		
		try {
			ProductsPage.settings(driver).click();
			LoggerClass.printInfo("Settings opened Successfully");
		} catch (IOException e) {
			LoggerClass.printError("Cannot open Settings");
		}
		try {
			SettingsPage.oldPassword(driver).sendKeys(UserDetails.getPassword());
			LoggerClass.printDebug("Entered old password");
		} catch (IOException e) {
			LoggerClass.printError("Old password wrong");
		}
		try {
			SettingsPage.newPassword(driver).sendKeys(UserDetails.getNewPassword());
			LoggerClass.printDebug("new password entered");
		} catch (IOException e) {
			LoggerClass.printError("Incorrect new password");
		}
		try {
			SettingsPage.confirmNewPasssword(driver).sendKeys(UserDetails.getNewPassword());
			LoggerClass.printDebug("new password confirmed");
		} catch (IOException e) {
			LoggerClass.printError("Failed to confirm new password");
		}
		try {
			SettingsPage.submitPasswordChange(driver).click();
			LoggerClass.printDebug("password changed Successfully");
		} catch (IOException e) {
			LoggerClass.printError("Failed to change password");
		}
		
	}

}

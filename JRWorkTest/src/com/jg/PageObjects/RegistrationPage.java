package com.jg.PageObjects;

import java.util.NoSuchElementException;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import operations.CommonFunctions;
import operations.JRSingleton;
import operations.ReadPropertiesFiles;

/*
 * @author Mohit
 * This class will store all the locators and methods of registration page.
 */

public class RegistrationPage {
	
	
	ReadPropertiesFiles getobject = new ReadPropertiesFiles();

	public void loginToJWRWithPN(String uid, String pass) {
		
			System.out.println("Handling push notificaiton");
			JRSingleton.getInstance().driver.findElement(By.className(ReadPropertiesFiles.loadProerptiesFile().getProperty("PuchNotificationbed"))).click();
			JRSingleton.getInstance().driver.findElement(By.id(ReadPropertiesFiles.loadProerptiesFile().getProperty("RegOldUserNameTextField"))).sendKeys(uid);
			JRSingleton.getInstance().driver.findElement(By.id(ReadPropertiesFiles.loadProerptiesFile().getProperty("RegOldPasswordTextField"))).sendKeys(pass);
			JRSingleton.getInstance().driver.findElement(By.xpath(ReadPropertiesFiles.loadProerptiesFile().getProperty("RegLoginButton"))).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
	
	
	public void registrationJWR(String uname, String pass, String email){
		
	}
	
	public void loginToJWRWithoutPN(String uid, String pass){
		try {
		System.out.println(" Entering user name");
		JRSingleton.getInstance().driver.findElement(By.id(ReadPropertiesFiles.loadProerptiesFile().getProperty("RegOldUserNameTextField"))).sendKeys(uid);
		JRSingleton.getInstance().driver.findElement(By.id(ReadPropertiesFiles.loadProerptiesFile().getProperty("RegOldPasswordTextField"))).sendKeys(pass);
		JRSingleton.getInstance().driver.findElement(By.xpath(ReadPropertiesFiles.loadProerptiesFile().getProperty("RegLoginButton"))).click();
		
		// Hangling Lobby popups
		Lobby.popHandlerLobby();
		
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void registarionWithNewUser(String email){
		try {
			Thread.sleep(1000);
			
			JRSingleton.getInstance().driver.findElement(By.xpath("RegNewUserNameTextField")).sendKeys();
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}

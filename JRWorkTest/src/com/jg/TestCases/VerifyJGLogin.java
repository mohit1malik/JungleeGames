package com.jg.TestCases;

import org.testng.annotations.Test;

import com.jg.PageObjects.Lobby;
import com.jg.PageObjects.RegistrationPage;

import operations.CommonFunctions;


/*
 * @author Mohit
 * This class is to verify login functionality on junglee rummy website
 */

public class VerifyJGLogin {
	

	@Test
	public void verifyValidLoging() throws InterruptedException {


		RegistrationPage login = new RegistrationPage();
		Lobby lobby = new Lobby();
		
		// login with old user
		System.out.println("Log in to JWR using old User name and Password");
		login.loginToJWRWithoutPN("jungleebond7", "matmalik");
		//Logout from JR
		System.out.println("Log out from JWR");
		lobby.logoutToJWR();
		
		//Login with New user
		System.out.println("Log in to JWR using new User name and Password");
		login.loginToJWRWithoutPN("jungleebond7", "matmalik");
		
		//Logout from JR
		System.out.println("Loging out from JWR");
		Thread.sleep(1000);
		lobby.logoutToJWR();
		
		//Close browser
		
		CommonFunctions.quitDriver();
		
	}
}

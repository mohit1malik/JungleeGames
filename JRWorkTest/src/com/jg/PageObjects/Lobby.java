package com.jg.PageObjects;

import org.openqa.selenium.By;

import operations.JRSingleton;
import operations.ReadPropertiesFiles;

public class Lobby {

	
	
	
	public void logoutToJWR(){
		try {
		JRSingleton.getInstance().driver.findElement(By.id(ReadPropertiesFiles.loadProerptiesFile().getProperty("LbyLogoutButton"))).click();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void popHandlerLobby(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Boolean closeRAFpopupButton = JRSingleton.getInstance().driver.findElements(By.className("LBYRAFpopupCloseButton")).size()!=0; 
		Boolean closeMyAccountPopupButton = JRSingleton.getInstance().driver.findElements(By.partialLinkText("Verify Your Account Details")).size()!=0;
		Boolean closeBonusPopupButoon= JRSingleton.getInstance().driver.findElements(By.xpath("//html//body//app-root//popup-manager//div[2]//div")).size()!=0;
		
		if(closeBonusPopupButoon){
			System.out.println("Bonus popup found on lobby");
			JRSingleton.getInstance().driver.findElement(By.xpath("//html//body//app-root//popup-manager//div[2]//div")).click();
		}
		
		else if(closeRAFpopupButton){
			System.out.println("RAF popup found on Lobby");
			JRSingleton.getInstance().driver.findElement(By.xpath("LBYRAFpopupCloseButton")).click();
			
		}
		else if(closeMyAccountPopupButton){
			System.out.println("My Account popup found on Lobby");
			JRSingleton.getInstance().driver.findElement(By.partialLinkText("Verify Your Account Details")).click();
		}
		
		else{
			System.out.println("No Pop up found");
		}
	
		}
	
	
	
}

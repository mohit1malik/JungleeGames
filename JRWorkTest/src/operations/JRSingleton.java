package operations;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JRSingleton {

	private static JRSingleton singletonDriver;
	public WebDriver driver;
	public static Properties prop = new Properties();
	private static Logger logger = Logger.getRootLogger();
	private static String siteUrl = "www.jwrdevjg.com";
	private static String login = "jwradmin";
	private static String password = "7tsYjhji0ii0U5wiAqZz";

	// Private singleton class constructor

	private JRSingleton() {
		launchBrowser("chrome");
	}

	public static JRSingleton getInstance() {
		if (singletonDriver == null) {
			singletonDriver = new JRSingleton();
			return  singletonDriver;
		}
		return singletonDriver;
	}
	
	
	
	
	private void launchBrowser(String browser) {

		try {
			// Set Chrome as browser
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "G:\\Eclipsejar\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Chrome browser Launched");
			}
			// Set Mozila Firefox as browser
			else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.firefox.marionette", "G://Eclipsejar//geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("please give select a browser in Testng xml");
			}

			driver.manage().window().maximize();
			System.out.println("Getting URL- "+ "https://" + login + ":" + password + "@" + siteUrl);
			driver.get("https://" + login + ":" + password + "@" + siteUrl);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void quit(){
		System.out.println("Driver Quit");
		this.driver.quit();
	}
	
}

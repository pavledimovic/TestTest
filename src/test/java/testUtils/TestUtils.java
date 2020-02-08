package testUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestUtils {
	
	static WebDriver driver;
	
	public TestUtils(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}
	
	// Base URL
	public static String URL = "https://coinmarketcap.com/";

	// Paths for local web driver
	public static String Firefox = ("C:/Selenium/Mozilla/GeckoDriver.exe");
	public static String Chrome = ("C:/Selenium/Chrome/ChromeDriver.exe");
	

	

}
